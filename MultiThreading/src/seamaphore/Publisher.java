package seamaphore;

import java.util.concurrent.Semaphore;

public class Publisher implements Runnable {

    private Semaphore publisherSema;
    private Semaphore consumerSema;
    private Store store;
    Publisher(Semaphore publisherSema, Semaphore consumerSema, Store store)
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
                publisherSema.acquire(); // wait if store is full (publisherSema = 0)
                store.addItem(1);
                consumerSema.release(); // signal consumer that a new item is available
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
