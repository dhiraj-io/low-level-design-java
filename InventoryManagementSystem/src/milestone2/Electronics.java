package milestone2;

public class Electronics extends Item {

    private int warranty;


    public Electronics(int warranty) {
        super();
        this.warranty = warranty;
    }


    public Electronics() {
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public Electronics(String id, String name, double price, int quantity, int warranty) {
        super(id, name, price, quantity);
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return super.toString() + "Electronics{" +
                "warranty=" + warranty +
                '}';
    }
}
