public class client {

    public static void main(String[] args) {
        ObjectPair p = new ObjectPair();

        p.setX(10);
        p.setY("hello");

        int x = (int)p.getX();

        Pair<String, Double> p1 = new Pair<>();
        p1.setX("ABC");
        p1.setY(23.0);

        Pair.doSomething("Test");
        System.out.println(p1.getX());
        System.out.println(p1.getY());
    }
}
