package seamaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class client {

    public static void main(String[] args)
    {

        Store store = new Store(10);
        // publisherSema(10): store has 10 empty slots, so publisher can add up to 10 items before blocking
        // consumerSema(0): store starts empty, so consumer blocks immediately until publisher adds an item
        Semaphore publisherSema = new Semaphore(10);
        Semaphore consumerSema = new Semaphore(0);

        ExecutorService es = Executors.newCachedThreadPool();


        for(int i = 0 ;i<5; i++) {
            Consumer consumer = new Consumer(publisherSema, consumerSema, store);
            es.execute(consumer);
        }

        for(int i = 0 ;i<5; i++) {
            Publisher publisher = new Publisher(publisherSema, consumerSema, store);
            es.execute(publisher);
        }



    }
}
