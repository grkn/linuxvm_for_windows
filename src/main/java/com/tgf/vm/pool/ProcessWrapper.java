package com.tgf.vm.pool;

import lombok.*;

import java.util.concurrent.locks.ReentrantLock;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ProcessWrapper {
    private Process process;
    private boolean isActive;
    private long pid;
    private boolean isAdmin;
    private ReentrantLock lock;
}
