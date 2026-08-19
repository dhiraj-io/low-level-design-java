package publisherConsumer;

public class Consumer implements Runnable {

    private Store store;

    Consumer(Store store)
    {
        this.store = store;
    }
    @Override
    public void run() {
        while (true) {
            store.remove();
        }
    }
}
