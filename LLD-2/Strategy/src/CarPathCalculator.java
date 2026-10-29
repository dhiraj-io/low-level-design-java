public class CarPathCalculator implements PathCalculator{
    @Override
    public Path calculate(String source, String dest) {
        System.out.println("Traveling via CAR");
        return new Path(15, 1);
    }
}
