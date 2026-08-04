package mergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(1);
        arr.add(3);
        arr.add(2);
        arr.add(10);
        arr.add(4);

        ExecutorService ex = Executors.newFixedThreadPool(arr.size());
        sorter sorter = new sorter(arr, ex);
        Future<List<Integer>> futureList = ex.submit(sorter);

        System.out.println(futureList.get());

        ex.shutdown();




    }
}
