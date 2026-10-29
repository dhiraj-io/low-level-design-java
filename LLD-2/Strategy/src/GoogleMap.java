public class GoogleMap {

    private PathCalculator pathCalculator;

    public GoogleMap(String mode) {
        this.pathCalculator = PathCalculatorFactory.getPathCalculator(mode);
    }


    public Path calculatePath(String source, String destination)
    {
       return pathCalculator.calculate(source, destination);
    }
}
