public class Item implements Comparable<Item>
{

    private String id;
    private String name;
    private double price;
    private int quantity;

    Item(String id, String name, double price, int quantity)
    {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId()
    {
        return  this.id;
    }
    public String getName()
    {
        return  this.name;
    }
    public double getPrice()
    {
        return  this.price;
    }
    public int getQuantity()
    {
        return  this.quantity;
    }

    public void setId(String id)
    {
        this.id = id;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Item o) {
        return this.name.compareTo(o.name);
    }
}
