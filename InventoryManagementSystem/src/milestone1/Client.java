package milestone1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {

    public static void main(String[] args)
    {
        Item i1 = new Book("1", "Book1", 125, 25, "Book1Author");
        Item i2 = new Clothing("2", "Tshirt", 120, 20, "L");
        Item i3 = new Electronics("3", "JBL", 130, 28, 2);

        List<Item> items = new ArrayList<>();
        items.add(i1);
        items.add(i2);
        items.add(i3);

        Collections.sort(items);
        System.out.println(items);

        List<Item> items2 = new ArrayList<>();
        items2.add(i1);
        items2.add(i2);
        items2.add(i3);

        Collections.sort(items2, new ItemPriceComparator());
        System.out.println(items2);




    }
}
