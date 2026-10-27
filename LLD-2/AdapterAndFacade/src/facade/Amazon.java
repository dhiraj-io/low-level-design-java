package facade;

import java.util.UUID;

public class Amazon {

    PlaceOrderFacade placeOrderFacade;

    public Amazon() {
        this.placeOrderFacade = new PlaceOrderFacade();
    }


    public void placeOrder(int itemId, int quantity)
    {
        placeOrderFacade.placOrder(new Order(UUID.randomUUID().toString(), itemId, quantity));
    }
}

