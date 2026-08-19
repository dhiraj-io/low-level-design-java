/*
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

        List<Item> items = new ArrayList<>();
        items.add(new Book("B1", "Java", 500, 10, "James"));
        items.add(new Clothing("C1", "T-Shirt", 800, 5, "L"));
        items.add(new Electronics("E1", "Laptop", 50000, 2, 2));

        System.out.println("Before Sorting");
        for(Item item : items)
        {
                System.out.println(item.getName());
        }
        Collections.sort(items);

        System.out.println("After Sorting");
        for(Item item : items)
        {
                System.out.println(item.getName());
        }
    }

*/
