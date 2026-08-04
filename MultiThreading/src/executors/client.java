package executors;

// Demonstrates the performance difference between:
// 1. Creating a new thread per task (without pool) — slow, resource-heavy
// 2. Fixed thread pool via ExecutorService — fast, resource-efficient
//
// Results on 1,000,000 tasks:
//   Without pool : ~51 sec  (1M thread creations, each needs OS stack + registration)
//   With pool (5): ~2 sec   (5 threads reused, tasks queued on heap)
//
// Key insight: task creation (object on heap) is cheap.
//              thread creation (OS stack + registration) is expensive.
//
// Toggle normalThread = true/false to switch between both scenarios.

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class client {
    public static void main(String[] args) throws InterruptedException {

        boolean normalThread = false;

        if (normalThread) {
            // SCENARIO 1: new thread per task — 1M threads created and destroyed
            long start = System.currentTimeMillis();

            for (int i = 0; i <= 1000000; i++) {
                IndividualNumberPrinter obj = new IndividualNumberPrinter(i);
                Thread th = new Thread(obj);
                th.start();
            }

            long end = System.currentTimeMillis();
            System.out.println("Without pool — Time Taken: " + (end - start) / 1000.0 + " sec");

        } else {
            // SCENARIO 2: fixed thread pool — 5 threads reused for 1M tasks
            // Tasks are queued; idle threads pick them up automatically
            long start = System.currentTimeMillis();

            ExecutorService ex = Executors.newFixedThreadPool(5);

            for (int i = 0; i <= 1000000; i++) {
                IndividualNumberPrinter obj = new IndividualNumberPrinter(i);
                ex.execute(obj);  // adds to queue — does NOT create a new thread
            }

            ex.shutdown();                                             // no new tasks accepted
            ex.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS); // wait for all tasks to finish

            long end = System.currentTimeMillis();
            System.out.println("With pool (5 threads) — Time Taken: " + (end - start) / 1000.0 + " sec");
        }
    }
}
