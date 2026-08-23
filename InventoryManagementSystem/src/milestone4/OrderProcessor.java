package milestone4;

import java.util.PriorityQueue;

public class OrderProcessor {

    private PriorityQueue<Order> orders;


    public OrderProcessor() {
        this.orders = new PriorityQueue<>();
    }

    public void addOrder(Order order)
    {
        // PriorityQueue calls compareTo on every add() to place element correctly
        // Without Comparable implemented → ClassCastException at runtime on 2nd add()
        orders.add(order);
    }

    public Order processOrder()
    {
        return orders.remove();
    }
}
