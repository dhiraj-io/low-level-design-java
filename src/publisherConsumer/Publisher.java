package publisherConsumer;

public class Publisher implements Runnable {

    private Store store;

    Publisher(Store store)
    {
        this.store = store;
    }
    @Override
    public void run() {
        while (true) {
            store.addItem(1);
        }
    }
}
