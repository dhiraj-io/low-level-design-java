package facade;

import java.util.ArrayList;
import java.util.List;

public class PlaceOrderFacade {

    private MailService mailService;
    private InvoiceService invoiceService;
    private InventoryService inventoryService;

    private List<PlaceOrderSubscriber> subscribers;

    public PlaceOrderFacade() {
        this.mailService = new MailService();
        this.invoiceService = new InvoiceService();
        this.inventoryService = new InventoryService();
        this.subscribers = new ArrayList<>();
    }


    // expose two apis
    public void subscribe(PlaceOrderSubscriber subscriber)
    {
        subscribers.add(subscriber);
    }

    public void unSubscribe(PlaceOrderSubscriber subscriber)
    {
        subscribers.remove(subscriber);
    }
    public void placOrder(Order order)
    {
        try {
            inventoryService.updateInventory(order);
            invoiceService.generateInvoice(order);
            mailService.sendEmail(order);
            notifyAllSubscribers(order);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void notifyAllSubscribers(Order order)
    {
        for(PlaceOrderSubscriber subscriber : subscribers)
        {
            subscriber.onOrderPlaced(order);
        }
    }
}
