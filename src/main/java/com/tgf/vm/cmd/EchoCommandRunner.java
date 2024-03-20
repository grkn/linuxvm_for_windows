package com.tgf.vm.cmd;

import com.tgf.vm.pool.ProcessWrapper;
import com.tgf.vm.util.CommonUtil;
import lombok.RequiredArgsConstructor;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EchoCommandRunner implements CmdRunner {
    private static final String ECHO = "wsl -e sh -c \"docker run hello-world\"";
    private final GenericObjectPool<ProcessWrapper> objectPool;

    @Override
    public void runCommand() throws Exception {
        ProcessWrapper processWrapper = objectPool.borrowObject();
        Process process = processWrapper.getProcess();
        CommonUtil.lock();
        CommonUtil.write(process.outputWriter(), ECHO);
        objectPool.returnObject(processWrapper);
    }
}
