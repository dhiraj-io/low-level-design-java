package facade;

public class client {

    public static void main(String[] args) {
        Amazon amazon = new Amazon();

        LoyalityService loyalityService = new LoyalityService(amazon);
        RecommendationService recommendationService = new RecommendationService(amazon);
        amazon.placeOrder(123, 50);
    }
}
