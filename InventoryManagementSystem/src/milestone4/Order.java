package milestone4;
import java.util.PriorityQueue;

public class Order implements Comparable<Order> {

    private String orderId;
    private boolean isExpress;

    public Order(String orderId, boolean isExpress) {
        this.orderId = orderId;
        this.isExpress = isExpress;
    }

    // PriorityQueue is min-heap by default — "smallest" element comes out first
    // express=true must be "smaller" than express=false to come out first
    @Override
    public int compareTo(Order o) {
        if(this.isExpress && !o.isExpress)
        {
            return -1;
        }
        else if(!this.isExpress && o.isExpress)
        {
            return 1;
        }
        else
        {
            return this.orderId.compareTo(o.orderId);
        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", isExpress=" + isExpress +
                '}';
    }
}
