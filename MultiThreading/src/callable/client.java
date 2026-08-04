package callable;

import java.util.concurrent.*;

public class client {

    public static void main(String[] arg) throws ExecutionException, InterruptedException {
        numberMultiplier numberMultiplier = new numberMultiplier(5);
        ExecutorService ex = Executors.newFixedThreadPool(2);


       Future<Integer> future =  ex.submit(numberMultiplier);

       System.out.println("Hello");
       int val = future.get(); // blocking call
       System.out.println(val);
       ex.shutdown();

    }
}
