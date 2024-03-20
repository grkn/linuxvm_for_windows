package com.tgf.vm.cmd;

import com.tgf.vm.pool.ProcessWrapper;
import com.tgf.vm.util.CommonUtil;
import lombok.RequiredArgsConstructor;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DockerSetupCommandRunner implements CmdRunner {
    private final GenericObjectPool<ProcessWrapper> objectPool;
    private static final String SETUP_COMMAND = "wsl ~ -u root -d Ubuntu -e sh -c \"sudo apt install docker-ce docker-compose; " +
            "sudo systemctl status docker; " +
            "sudo usermod -aG docker root\"";

    @Override
    public void runCommand() throws Exception {
        ProcessWrapper processWrapper = objectPool.borrowObject();
        Process process = processWrapper.getProcess();
        CommonUtil.write(process.outputWriter(), SETUP_COMMAND);
        objectPool.returnObject(processWrapper);
    }
}
