package ru.schepachkov.pattern.singleton.model;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 *  Lazy thread-safe init
 */
public class Singleton {

    private static volatile Singleton INSTANCE;

    private static Lock lock = new ReentrantLock();

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            if (lock.tryLock()) {
                try {
                    System.out.println(Thread.currentThread().getName() + ", Lock");
                    INSTANCE = new Singleton();
                    return INSTANCE;
                } finally {
                    System.out.println(Thread.currentThread().getName() + ", Unlock");
                    lock.unlock();
                }
            } else {
                System.out.println(Thread.currentThread().getName() + ", Cant get Singleton, will try again!");
                return getInstance();
            }
        }
        return INSTANCE;
    }
}
