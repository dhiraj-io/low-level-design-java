package publisherConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class client {
    public static void main(String[] args)
    {
        ExecutorService es = Executors.newCachedThreadPool();

        //10 producer
        // 15 consumer



        Store store = new Store(10);
        for(int i = 0; i<10; i++)
        {
            Publisher p = new Publisher(store);
            es.execute(p);
        }

        for(int i = 0; i<15; i++)
        {
            Consumer c = new Consumer(store);
            es.execute(c);
        }
    }
}
