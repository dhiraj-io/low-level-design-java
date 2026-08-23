package milestone3;

import java.util.LinkedList;

public class RecentlyViewedItems {

    private LinkedList<Item> rvi;
    public RecentlyViewedItems() {
        this.rvi = new LinkedList<>();
    }

    public void addRecentlyViewedItem(Item item)
    {
        rvi.add(item);
        // add one at a time → size can only exceed by 1 → removeFirst() once is enough (no while loop)
        // LinkedList removeFirst() is O(1) — just updates head pointer
        if(rvi.size() > 10)
            rvi.removeFirst();
    }

    public LinkedList<Item> getRvi() {
        return rvi;
    }
}
