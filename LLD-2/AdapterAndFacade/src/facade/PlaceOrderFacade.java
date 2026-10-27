package facade;

public class PlaceOrderFacade {

    private MailService mailService;
    private InvoiceService invoiceService;
    private InventoryService inventoryService;

    public PlaceOrderFacade() {
        this.mailService = new MailService();
        this.invoiceService = new InvoiceService();
        this.inventoryService = new InventoryService();
    }


    public void placOrder(Order order)
    {
        try {
            inventoryService.updateInventory(order);
            invoiceService.generateInvoice(order);
            mailService.sendEmail(order);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
