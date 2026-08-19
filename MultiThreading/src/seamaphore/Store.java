package seamaphore;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Store {

    private List<Integer> items;
    private int maxStoreSize;

    private Lock lock = new ReentrantLock();

    Store(int maxStoreSize)
    {
        items = new ArrayList<>(maxStoreSize);
        this.maxStoreSize = maxStoreSize;
    }

    public void addItem(int item)
    {
        lock.lock();
        try {
            if (items.size() < maxStoreSize) {
                items.add(item);
                System.out.println(" Added an item, Store Size is :" + items.size());
            }
        }
        finally {
            lock.unlock();
        }
    }

    public void removeItem()
    {
        lock.lock();
        try {
            if (items.size() > 0) {
                items.remove(items.size() - 1);
                System.out.println(" Removed an item, Store Size is :" + items.size());
            }
        }
        finally {
            lock.unlock();
        }
    }
}
