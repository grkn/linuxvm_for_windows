package com.tgf.vm.pool;

import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class GlobalThreadPool implements ThreadFactory {
    private final AtomicInteger atomicInteger = new AtomicInteger(0);
    private final ExecutorService threadPool = Executors.newFixedThreadPool(10, this);

    @Override
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(new ThreadGroup("GlobalThreadPoolGroup"), runnable, "global-" + atomicInteger.getAndIncrement());
        thread.setPriority(Thread.NORM_PRIORITY);
        thread.setDaemon(true);
        return thread;
    }


    public ExecutorService getThreadPool() {
        return threadPool;
    }
}
