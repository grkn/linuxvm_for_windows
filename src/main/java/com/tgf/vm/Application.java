package com.tgf.vm;

import com.tgf.vm.cmd.AptCommandRunner;
import com.tgf.vm.cmd.DockerSetupCommandRunner;
import com.tgf.vm.cmd.WslInstaller;
import com.tgf.vm.util.CommonUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@RequiredArgsConstructor
public class Application {
    private static String username;
    private static String password;
    private static String javaHome;

    public static void main(String[] args) throws Exception {
        if (args == null || args.length < 2) {
            System.out.println("Please enter username password.");
            System.out.println("java -jar linuxvm.for.windows-1.0.0.jar username password");
            return;
        }
        Application.username = args[0];
        Application.password = args[1];
        Application.javaHome = args[2];

        final AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.scan("com.tgf.vm");
        applicationContext.refresh();
        applicationContext.start();
        while (!applicationContext.isActive()) {
            Thread.sleep(100);
        }

        try {
            applicationContext.getBean(WslInstaller.class).runCommand();
            Thread.sleep(10000);
            applicationContext.getBean(AptCommandRunner.class).runCommand();
            Thread.sleep(10000);
            applicationContext.getBean(DockerSetupCommandRunner.class).runCommand();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        while (applicationContext.isRunning()) {
            Thread.sleep(5000);
            //   applicationContext.getBean(EchoCommandRunner.class).runCommand();
        }
    }

    public static String getJavaHome() {
        return javaHome;
    }

    public static String getPassword() {
        return password;
    }

    public static String getUsername() {
        return username;
    }


}
