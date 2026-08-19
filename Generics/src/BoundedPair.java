public class BoundedPair<T extends Number, V extends Number> {

    T x;
    V y;

    BoundedPair(T x, V y) {
        this.x = x;
        this.y = y;
    }

    public T getX() { return x; }
    public V getY() { return y; }

    public int sum() {
        return x.intValue() + y.intValue();
    }

    public static void main(String[] args) {

        BoundedPair<Integer, Double> p = new BoundedPair<>(10, 20.5);
        System.out.println(p.sum()); // 30

        // BoundedPair<String, Double> p2 = new BoundedPair<>("hello", 20.0); // COMPILE ERROR — String not a Number
    }
}
