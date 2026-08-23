package milestone3;

import java.util.LinkedList;

public class Client {

    public static void main(String[] args) throws Exception {
        Item i1 = new Book("1", "Book1", 125, 25, "Book1Author");
        Item i2 = new Clothing("2", "Tshirt", 120, 20, "L");
        Item i3 = new Electronics("3", "JBL", 130, 28, 2);

        Item i4 = new Book("4", "Book1", 125, 25, "Book1Author");
        Item i5 = new Clothing("5", "Tshirt", 120, 20, "L");
        Item i6 = new Electronics("6", "JBL", 130, 28, 2);

        Item i7 = new Book("7", "Book1", 125, 25, "Book1Author");
        Item i8 = new Clothing("8", "Tshirt", 120, 20, "L");
        Item i9 = new Electronics("9", "JBL", 130, 28, 2);

        Item i10 = new Book("10", "Book1", 125, 25, "Book1Author");
        Item i11 = new Clothing("11", "Tshirt", 120, 20, "L");
        Item i12 = new Electronics("12", "JBL", 130, 28, 2);


        RecentlyViewedItems rvi = new RecentlyViewedItems();
        rvi.addRecentlyViewedItem(i1);
        rvi.addRecentlyViewedItem(i2);
        rvi.addRecentlyViewedItem(i3);
        rvi.addRecentlyViewedItem(i4);
        rvi.addRecentlyViewedItem(i5);
        rvi.addRecentlyViewedItem(i6);
        rvi.addRecentlyViewedItem(i7);
        rvi.addRecentlyViewedItem(i8);
        rvi.addRecentlyViewedItem(i9);
        rvi.addRecentlyViewedItem(i10);
        rvi.addRecentlyViewedItem(i11);
        rvi.addRecentlyViewedItem(i12);

        System.out.println(rvi.getRvi());


//        Inventory<Book> iBook = new Inventory<>();
//        iBook.addItem(i2);

    }
}
