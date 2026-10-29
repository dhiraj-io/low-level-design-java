import java.util.HashMap;

public class PathCalculatorFactory {

    private static HashMap<String, PathCalculator> pathCalculatorHashMap = new HashMap<>() ;
    static // eager way of singleton
    {
        pathCalculatorHashMap.put("CAR", new CarPathCalculator());
        pathCalculatorHashMap.put("WALK", new WalkPathCalculator());
    }
    public static PathCalculator getPathCalculator(String mode)
    {
        if(pathCalculatorHashMap.containsKey(mode.toUpperCase()))
       return pathCalculatorHashMap.get(mode.toUpperCase());

        throw new RuntimeException("Mode not supported");
    }
}
