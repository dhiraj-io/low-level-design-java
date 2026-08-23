package milestone5;

public class Clothing extends Item {
    private String Size;


    public Clothing(String size) {
        Size = size;
    }

    public Clothing(String id, String name, double price, int quantity, String size) {
        super(id, name, price, quantity);
        Size = size;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    @Override
    public String toString() {
        return super.toString() + "Clothing{" +
                "Size='" + Size + '\'' +
                '}';
    }
}
