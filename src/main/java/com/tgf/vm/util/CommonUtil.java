package com.tgf.vm.util;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;

public class CommonUtil {

    private static final ReentrantLock GLOBAL_LOCK = new ReentrantLock();
    private static final Object LOCK = new Object();
    public static Boolean WAITING_RESPONSE = true;

    private CommonUtil() {
    }

    public static void write(BufferedWriter bufferedWriter, String command) throws IOException {
        // dont close output stream because we keep it object pool
        bufferedWriter.write(command, 0, command.length());
        bufferedWriter.write(System.lineSeparator());
        bufferedWriter.flush();
    }

    public static void lock() {
        GLOBAL_LOCK.lock();
    }

    public static void unlock() {
        GLOBAL_LOCK.unlock();
    }
}
