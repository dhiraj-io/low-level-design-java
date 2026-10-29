package facade;

import java.util.UUID;

public class Amazon {

    public PlaceOrderFacade getPlaceOrderFacade() {
        return placeOrderFacade;
    }

    public void setPlaceOrderFacade(PlaceOrderFacade placeOrderFacade) {
        this.placeOrderFacade = placeOrderFacade;
    }

    PlaceOrderFacade placeOrderFacade;

    public Amazon() {
        this.placeOrderFacade = new PlaceOrderFacade();
    }


    public void placeOrder(int itemId, int quantity)
    {
        placeOrderFacade.placOrder(new Order(UUID.randomUUID().toString(), itemId, quantity));
    }
}

