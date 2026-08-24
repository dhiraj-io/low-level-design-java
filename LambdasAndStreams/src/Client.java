import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Client {

    public static void main(String[] args)
    {
//        Task t = new Task();
//        Thread th = new Thread(t);
//        th.start();

//        Runnable task = () ->{
//            System.out.println("Task is running");
//        };
//
//        Thread th = new Thread(task);
//        th.start();

//        List<Integer> l = Arrays.asList(2,4,-3,-5,1); // sort based on squares of number;
//
//        Collections.sort(l, (a,b) -> {
//            return Double.compare(a*a, b*b);
//        });
//
//        System.out.println(l);

        Calculator cal = (a,b,c) -> {
            return a + b + c;
        };

        System.out.println(cal.calculate(1,2,3));
    }
}
