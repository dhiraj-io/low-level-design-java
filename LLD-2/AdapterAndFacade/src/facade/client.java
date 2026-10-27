package facade;

public class client {

    public static void main(String[] args) {
        Amazon amazon = new Amazon();

        amazon.placeOrder(123, 50);
    }
}
