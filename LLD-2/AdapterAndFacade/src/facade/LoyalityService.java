package facade;

public class LoyalityService implements PlaceOrderSubscriber {

    public LoyalityService(Amazon amozon) {
        amozon.getPlaceOrderFacade().subscribe(this);
    }


    public void updateLoyalty(Order order)
    {
        System.out.println("Loyality updated for "+order.getOrderId());
    }


    @Override
    public void onOrderPlaced(Order order) {
        updateLoyalty(order);
    }
}
