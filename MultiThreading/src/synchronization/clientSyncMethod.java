package synchronization;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class clientSyncMethod {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService ex = Executors.newFixedThreadPool(2);


        Value2 v = new Value2();

        AdderSyncMethod a = new AdderSyncMethod(v);
        SubtracterSyncMethod s = new SubtracterSyncMethod(v);

        Future<Void> aAns = ex.submit(a);
        Future<Void> sAns = ex.submit(s);

        aAns.get() ;
        sAns.get();

        System.out.println(v.getX());
    }
}
