

public class Item implements Comparable<Item> {
    private String id;
    private String name;
    private int quantity;
    private double price;


    public Item(String id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    // This and other object
    // think like you have 2 item, 1,2
    // this represents always current item i.e 2 and other is previous in this case 1
    // suppose this is already greater than other and you want item to be sorted in ascending order, so return positive
    // if not then return -ve , do this vice versa for descending.
    @Override
    public int compareTo(Item o) {
        //version 1
//        if(this.price > o.price)
//        {
//            return 1;
//        }
//        else if (this.price < o.price)
//        {
//            return -1;
//        }
//        else
//            return  0;
        //version 2
       // return Double.compare(this.price, o.price); // ascending
        //version 3
       // return Double.compare(o.price, this.price); // descending
        //version 4
        if(Double.compare(this.price, o.price) == 0)
        {
            return Double.compare(this.quantity, o.quantity);
        }
        else
            return Double.compare(this.price, o.price);
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
