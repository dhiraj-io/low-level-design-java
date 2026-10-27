package facade;

public class InvoiceService {

    public void generateInvoice(Order order)
    {
        System.out.println("Generating invoice for order id: " + order.getOrderId());
    }
}
