package com.tgf.vm.pool;

import com.tgf.vm.cmd.reader.CmdReader;
import lombok.RequiredArgsConstructor;
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.PooledObjectFactory;
import org.apache.commons.pool2.impl.DefaultPooledObject;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.time.Duration;

@Component
@RequiredArgsConstructor
public class CmdProcessorObjectPool {
    private static final String CMD = "cmd";

    private final GlobalThreadPool globalThreadPool;

    @Bean
    public GenericObjectPool<ProcessWrapper> processGenericObjectPool() {
        GenericObjectPoolConfig<ProcessWrapper> config = new GenericObjectPoolConfig<>();
        config.setMaxIdle(1);
        config.setMaxTotal(1);
        config.setMinIdle(1);
        config.setMaxWait(Duration.ofSeconds(10));

        return new GenericObjectPool<>(new PooledObjectFactory<>() {
            @Override
            public void activateObject(PooledObject<ProcessWrapper> pooledObject) throws Exception {
                pooledObject.getObject().setActive(true);
            }

            @Override
            public void destroyObject(PooledObject<ProcessWrapper> pooledObject) throws Exception {
                pooledObject.getObject().getProcess().destroyForcibly();
            }

            @Override
            public PooledObject<ProcessWrapper> makeObject() throws Exception {
                ProcessBuilder processBuilder = new ProcessBuilder(CMD);
                final Process process = processBuilder.start();
                globalThreadPool.getThreadPool().submit(new CmdReader(process.getInputStream(), process.getOutputStream()));
                return new DefaultPooledObject<>(ProcessWrapper.builder()
                        .process(process)
                        .isAdmin(true)
                        .isActive(false)
                        .pid(process.pid())
                        .build());
            }

            @Override
            public void passivateObject(PooledObject<ProcessWrapper> pooledObject) throws Exception {
                pooledObject.getObject().setActive(false);
            }

            @Override
            public boolean validateObject(PooledObject<ProcessWrapper> pooledObject) {
                return pooledObject.getObject().getProcess() != null && pooledObject.getObject().getProcess().isAlive();
            }
        }, config);
    }
}
