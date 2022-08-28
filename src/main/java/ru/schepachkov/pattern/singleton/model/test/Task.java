package ru.schepachkov.pattern.singleton.model.test;

import ru.schepachkov.pattern.singleton.model.Singleton;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public class Task implements Callable<Set<Singleton>> {

    private int iterations;
    private CountDownLatch countDownLatch;

    public Task(int iterations, CountDownLatch countDownLatch) {
        this.iterations = iterations;
        this.countDownLatch = countDownLatch;
    }

    public Set<Singleton> call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " is ready to start!");
        countDownLatch.await();
        Set<Singleton> singletons = new HashSet<>();
        for (int i = 0; i < iterations; i++) {
            singletons.add(Singleton.getInstance());
        }
        return singletons;
    }
}
