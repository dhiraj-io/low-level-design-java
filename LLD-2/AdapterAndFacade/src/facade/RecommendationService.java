package facade;

public class RecommendationService implements PlaceOrderSubscriber{

    public RecommendationService(Amazon amazon)
    {
        amazon.getPlaceOrderFacade().subscribe(this);
    }
    public void updateReco(Order order)
    {
        System.out.println("Updating recommendation based on "+order.getOrderId());
    }

    @Override
    public void onOrderPlaced(Order order) {
        updateReco(order);
    }
}
