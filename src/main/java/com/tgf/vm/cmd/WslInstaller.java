package com.tgf.vm.cmd;

import com.tgf.vm.pool.ProcessWrapper;
import com.tgf.vm.util.CommonUtil;
import lombok.RequiredArgsConstructor;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WslInstaller implements CmdRunner {
    private static final String INSTALL_COMMAND = "powershell.exe Start-Process -Wait cmd.exe -verb RunAs '-Command cmd /c wsl --install'";

    private final GenericObjectPool<ProcessWrapper> objectPool;

    public void runCommand() throws Exception {
        ProcessWrapper processWrapper = objectPool.borrowObject();
        final Process process = processWrapper.getProcess();
        CommonUtil.write(process.outputWriter(), INSTALL_COMMAND);
        objectPool.returnObject(processWrapper);
    }
}
