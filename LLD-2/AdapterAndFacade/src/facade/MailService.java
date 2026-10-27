package facade;

public class MailService {

    public void sendEmail(Order order)
    {
        System.out.println(" Sending email for Order id: " + order.getOrderId());
    }
}
