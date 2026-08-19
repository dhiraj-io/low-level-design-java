package publisherConsumer;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Integer> items;
    private int maxStoreSize;

    Store(int maxStoreSize)
    {
        this.items = new ArrayList<>(maxStoreSize);
        this.maxStoreSize = maxStoreSize;
    }

    public synchronized void addItem(int x)
    {
        if(items.size() < maxStoreSize)
        {
            items.add(x);
            System.out.println(" Added an item, Queue Size is :" +items.size() );
        }
    }

    public synchronized void remove()
    {
        if(items.size() > 0)
        {
            items.remove(items.size() - 1);
            System.out.println(" Removed an item, Queue Size is :" +items.size() );
        }
    }
}
