public class WalkPathCalculator implements PathCalculator{
    @Override
    public Path calculate(String source, String dest) {
        System.out.println("Travelling via WALK");
        return new Path(5, 2.5);
    }
}
