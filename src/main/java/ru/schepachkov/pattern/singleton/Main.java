package ru.schepachkov.pattern.singleton;

import ru.schepachkov.pattern.singleton.model.Singleton;
import ru.schepachkov.pattern.singleton.model.test.Task;

import java.util.Set;
import java.util.concurrent.*;

/*
 * Creation pattern
 */

public class Main {

    private static final CountDownLatch COUNT_DOWN_LATCH = new CountDownLatch(1);

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = null;
        try {
            executorService = Executors.newFixedThreadPool(4);

            Future<Set<Singleton>> res1 = executorService.submit(new Task(200, COUNT_DOWN_LATCH));
            Future<Set<Singleton>> res2 = executorService.submit(new Task(200, COUNT_DOWN_LATCH));
            Future<Set<Singleton>> res3 = executorService.submit(new Task(150, COUNT_DOWN_LATCH));
            Future<Set<Singleton>> res4 = executorService.submit(new Task(200, COUNT_DOWN_LATCH));

            Thread.sleep(300);
            COUNT_DOWN_LATCH.countDown();

            System.out.println(res1.get());
            System.out.println(res2.get());
            System.out.println(res3.get());
            System.out.println(res4.get());
        } finally {
            if (executorService != null) {
                executorService.shutdown();
            }
        }
    }
}

/*
    Result:
        pool-1-thread-1 is ready to start!
        pool-1-thread-2 is ready to start!
        pool-1-thread-3 is ready to start!
        pool-1-thread-4 is ready to start!
        pool-1-thread-1, Lock
        pool-1-thread-3, Cant get Singleton, will try again!
        pool-1-thread-4, Cant get Singleton, will try again!
        pool-1-thread-2, Cant get Singleton, will try again!
        pool-1-thread-1, Unlock
        [ru.schepachkov.pattern.singleton.model.Singleton@720b0057]
        [ru.schepachkov.pattern.singleton.model.Singleton@720b0057]
        [ru.schepachkov.pattern.singleton.model.Singleton@720b0057]
        [ru.schepachkov.pattern.singleton.model.Singleton@720b0057]
*/
