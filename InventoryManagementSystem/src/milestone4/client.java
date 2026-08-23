package milestone4;

public class client {

    public static void main(String[] args)
    {
        OrderProcessor op = new OrderProcessor();
        op.addOrder(new Order("1", false)); // regular
        op.addOrder(new Order("2", true));  // express
        op.addOrder(new Order("3", false)); // regular
        op.addOrder(new Order("4", true));  // express
        op.addOrder(new Order("5", false)); // regular

        // express orders should come out before regular ones
        System.out.println(op.processOrder());
        System.out.println(op.processOrder());
        System.out.println(op.processOrder());
        System.out.println(op.processOrder());
        System.out.println(op.processOrder());
    }
}
