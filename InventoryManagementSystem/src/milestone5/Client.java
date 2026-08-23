package milestone5;

import java.util.List;

public class Client {

    public static void main(String[] args)
    {
        Item i1 = new Book("1", "Book1", 125, 25, "Book1Author");
        Item i2 = new Clothing("2", "Tshirt", 120, 20, "L");
        Item i3 = new Electronics("3", "JBL", 130, 0, 2);


        Inventory<Item> inv = new Inventory<>();
        inv.addItem(i1);
        inv.addItem(i2);
        inv.addItem(i3);
        List<Item> sorted =  inv.sortItems(new ItemPriceComparator());
        System.out.println("Sorted based on Item Price" + sorted);
        List<Item> items = inv.filterByPriceRange(100, 120);
        System.out.println(items);

        List<Item> sorted1 = inv.sortItems(new ItemQuantityComparator());
        System.out.println("Sorted based on Item Quantity" + sorted1);
        List<Item> items2 = inv.filterByAvailability();
                System.out.println(items2);




    }
}
