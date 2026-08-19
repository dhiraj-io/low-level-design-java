package synchronization;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class clientSync {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService ex = Executors.newFixedThreadPool(2);


        Value v = new Value();

        AdderSync a = new AdderSync(v);
        SubtracterSync s = new SubtracterSync(v);

        Future<Void> aAns = ex.submit(a);
        Future<Void> sAns = ex.submit(s);

        aAns.get() ;
        sAns.get();

        System.out.println(v.x);
    }
}
