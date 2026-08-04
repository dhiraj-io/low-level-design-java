package oneMillionSumPorblem;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        int cores = Runtime.getRuntime().availableProcessors();
        ExecutorService es = Executors.newFixedThreadPool(cores);

        ArrayList<Integer> input = new ArrayList<>();
        int chunks = 1000000/cores;
        for(int i = 1; i<=1000000; i++)
        {
            input.add(i);
        }

        int chunk = 1;
        long sum = 0;
        List<Future<Long>> fl = new ArrayList<>();
        for(int i =0; i<cores; i++)
        {
            int start = i * chunks;
            int end = (i == cores - 1) ? 1000000 : start + chunks; // last chunk handles remainder
            Sum s = new Sum(input.subList(start, end));
             fl.add(es.submit(s));

        }

        for(Future<Long> f: fl)
        {
            sum = sum + f.get();
        }
        System.out.println(sum);
    }
}
