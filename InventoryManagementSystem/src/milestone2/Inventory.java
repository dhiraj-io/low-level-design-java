package milestone2;

import java.util.Collection;
import java.util.HashMap;

// T extends Item: T must be Item or its subclass — allows calling item.getId() inside
// Enables both Inventory<Item> (mixed) and Inventory<Book> (type-specific)
public class Inventory <T extends Item>{
    private HashMap<String, T> items;

    public Inventory() {
        this.items = new HashMap<>();
    }

    public void addItem(T item)
    {
        if (item.getQuantity() < 0)
            throw new RuntimeException("Quantity cannot be negative");
        if(!items.containsKey(item.getId()))
        items.put(item.getId(), item);
        else
            throw new RuntimeException("Item " + item.getId() + " already exists");
    }

    public void removeItem(String id) throws Exception {
        if(items.containsKey(id))
        items.remove(id);
        else
            throw new Exception("No key found");
    }

    public T getItem(String id) {
        if(items.containsKey(id))
            return items.get(id);
        else
            return null;
    }

    public Collection<T> getAllItems() {
        return items.values();
    }
}
