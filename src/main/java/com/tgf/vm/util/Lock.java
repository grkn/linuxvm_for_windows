package com.tgf.vm.util;

@FunctionalInterface
public interface Lock<T> {
    T apply();
}
