import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



//Milestone 1
//Implementing Item Class Hierarchy
//Objective: Create a class hierarchy to represent different item types.
//Tasks:
//Create Base Class Item:
//Define common attributes:
//String id (unique identifier).
//String name (name of the item).
//double price (price of the item).
//int quantity (quantity in stock).
//Implement constructors and getter/setter methods.
//Create Subclasses for Specific Item Types:
//Electronics: Add int warranty attribute.
//        Clothing: Add String size attribute.
//Book: Add String author attribute.
//Implement Comparable<Item> Interface:
//Learning Resource: Comparable Interface in Java with Examples — Scaler Topics
//Write a compareTo method to sort items alphabetically by name.
//Write a Test Program for Subclasses:
//Instantiate a few items for each subclass.
//Add them to a list and test sorting by name.

public class client {

    public static void main(String[] args) {
        Item i1 = new Item("1", "Bat", 10, 1000);
        Item i2 = new Item("2", "Bowl", 20, 200);
        Item i3 = new Item("3", "Shirt", 15, 800);
        Item i4 = new Item("4", "Jeans", 12, 800);

        List<Item> itemList = new ArrayList<>();
        itemList.add(i1);
        itemList.add(i2);
        itemList.add(i3);
        itemList.add(i4);

        Collections.sort(itemList);
        System.out.println(itemList);
    }
}
