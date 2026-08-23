package milestone5;

import milestone5.Item;

import java.util.*;
import java.util.stream.Stream;

// T extends Item: T must be Item or its subclass — allows calling item.getId() inside
// Enables both Inventory<Item> (mixed) and Inventory<Book> (type-specific)
public class Inventory<T extends Item>{
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

    public List<T> filterByPriceRange(double minPrice, double maxPrice)
    {
        Stream<T> s = items.values().stream().filter(item -> item.getPrice() >= minPrice &&
                                                                item.getPrice() <= maxPrice);

        return s.toList();
    }

    public List<T> filterByAvailability()
    {
        return items.values().stream().filter(item -> item.getQuantity() > 0).toList();
    }

    public List<T> sortItems(Comparator<T> comparator)
    {
        List<T> sorted = new ArrayList<>(items.values());
        Collections.sort(sorted, comparator);
        return sorted;
    }
}
