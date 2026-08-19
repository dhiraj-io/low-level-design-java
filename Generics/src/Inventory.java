import java.util.Collection;
import java.util.HashMap;

public class Inventory<T extends Item>
{

    private HashMap<String, T> items;

    Inventory()
    {
        items = new HashMap<>();
    }
    public void addItem(T item)
    {
        items.put(item.getId(), item);
    }

    public void removeItem(String id)
    {
        items.remove(id);
    }

    public T getItem(String id)
    {
        return items.getOrDefault(id, null);
    }

    public Collection<T> getAllItems()
    {
        return items.values();
    }
}
