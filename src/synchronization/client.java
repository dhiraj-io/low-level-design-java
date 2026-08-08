package synchronization;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService ex = Executors.newFixedThreadPool(2);


        Value v = new Value();

        Lock lock = new ReentrantLock();
        Adder a = new Adder(v, lock);
        Subtracter s = new Subtracter(v, lock);

        Future<Void> aAns = ex.submit(a);
        Future<Void> sAns = ex.submit(s);

        aAns.get() ;
        sAns.get();

        System.out.println(v.x);
    }
}
