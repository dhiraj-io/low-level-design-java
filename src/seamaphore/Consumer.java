package seamaphore;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {

    private Semaphore publisherSema;
    private Semaphore consumerSema;
    private Store store;
    Consumer(Semaphore publisherSema, Semaphore consumerSema, Store store)
    {
        this.publisherSema = publisherSema;
        this.consumerSema = consumerSema;
        this.store = store;
    }


    @Override
    public void run() {
        while(true)
        {
            try {
                consumerSema.acquire(); // wait if store is empty (consumerSema = 0)
                store.removeItem();
                publisherSema.release(); // signal publisher that a slot is now free
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
