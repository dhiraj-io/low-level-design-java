import java.util.LinkedList;

public class RecentlyViewedItems {

    private LinkedList<Item> itemLinkedList;

    RecentlyViewedItems()
    {
        itemLinkedList = new LinkedList<>();
    }

    void addRecentlyViewedItem(Item item)
    {

        itemLinkedList.add(item);

        if(itemLinkedList.size() > 10) {
            itemLinkedList.removeFirst();
        }
    }
}
