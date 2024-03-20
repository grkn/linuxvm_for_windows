package com.tgf.vm.cmd;

import com.tgf.vm.pool.ProcessWrapper;
import com.tgf.vm.util.CommonUtil;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.springframework.stereotype.Component;


@Component
public class AptCommandRunner implements CmdRunner {
    private final GenericObjectPool<ProcessWrapper> objectPool;
    private static final String APT_COMMANDS = "wsl ~ -u root -d Ubuntu -e sh -c \"sudo apt-get update; " +
            "sudo apt-get install ca-certificates curl; " +
            "sudo install -m 0755 -d /etc/apt/keyrings; " +
            "sudo curl -fsSL https://download.docker.com/linux/ubuntu/gpg -o /etc/apt/keyrings/docker.asc; " +
            "sudo chmod a+r /etc/apt/keyrings/docker.asc\"";


    public AptCommandRunner(GenericObjectPool<ProcessWrapper> objectPool) {
        this.objectPool = objectPool;
    }

    @Override
    public void runCommand() throws Exception {
        ProcessWrapper processWrapper = objectPool.borrowObject();
        Process process = processWrapper.getProcess();
        CommonUtil.write(process.outputWriter(), APT_COMMANDS);
        objectPool.returnObject(processWrapper);
    }
}
