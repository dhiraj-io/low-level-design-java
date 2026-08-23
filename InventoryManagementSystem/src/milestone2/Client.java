package milestone2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {

    public static void main(String[] args) throws Exception {
        Item i1 = new Book("1", "Book1", 125, 25, "Book1Author");
        Item i2 = new Clothing("2", "Tshirt", 120, 20, "L");
        Item i3 = new Electronics("3", "JBL", 130, 28, 2);
        Inventory<Item> i = new Inventory<>();
        i.addItem(i1);
        i.addItem(i2);
        i.addItem(i3);

        System.out.println(i.getItem("1"));
        System.out.println(i.getAllItems());
        i.removeItem("1");
        System.out.println(i.getAllItems());

//        Inventory<Book> iBook = new Inventory<>();
//        iBook.addItem(i2);

    }
}
