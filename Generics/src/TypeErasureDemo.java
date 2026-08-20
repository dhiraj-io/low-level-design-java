import java.util.ArrayList;
import java.util.List;

public class TypeErasureDemo {

    public static void main(String[] args) {

        // 1. At runtime List<String> and List<Integer> are the same class
        List<String> stringList = new ArrayList<>();
        List<Integer> intList = new ArrayList<>();
        System.out.println(stringList.getClass() == intList.getClass()); // true
        System.out.println(stringList.getClass());                        // class java.util.ArrayList

        // 2. instanceof with generic type not allowed
        // if (stringList instanceof List<String>) { } // COMPILE ERROR
        if (stringList instanceof List<?>) {           // ✅ allowed
            System.out.println("is a List");
        }

        // 3. Cannot create generic array
        // T[] arr = new T[10]; // COMPILE ERROR — T unknown at runtime

        // 4. Cannot use primitives as type params — use wrapper classes
        // Pair<int, double> p; // COMPILE ERROR
        Pair<Integer, Double> p = new Pair<>(); // ✅

        // 5. Cannot overload methods that differ only by generic type
        // void print(List<String> list) { }  -- both erase to List
        // void print(List<Integer> list) { } -- COMPILE ERROR
    }
}
