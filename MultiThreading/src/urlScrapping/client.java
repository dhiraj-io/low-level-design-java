package urlScrapping;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class client {

    public static  void main(String[] args) throws ExecutionException, InterruptedException {

        List<String> urls = new ArrayList<>();

        for(int i = 0 ; i<100; i++)
        {
            urls.add("www.google.com/urlId:" + i);
        }

        // Fixed Thread Pool
        ExecutorService es = Executors.newFixedThreadPool(10);

        long fixedThreadPoolExecutionTime = ExecuteTask(urls, es);

        System.out.println("Time taken to scrap all URLs using fixed thread pool:" + fixedThreadPoolExecutionTime);

        // Cached Thread Pool
        ExecutorService cached = Executors.newCachedThreadPool();

        long cachedThreadPoolExecutionTime = ExecuteTask(urls, cached);

        System.out.println("Time taken to scrap all URLs using cached thread pool:" + cachedThreadPoolExecutionTime);



    }

    private static long ExecuteTask(List<String> urls, ExecutorService es ) throws ExecutionException, InterruptedException {

        long startTime = System.currentTimeMillis();
        List<Future<Void>> futureList = new ArrayList<>();
        for(String url: urls)
        {
            Future<Void> future = es.submit(new urlScrapper());
            futureList.add(future);
        }

        for(Future<Void> future: futureList)
        {
            future.get();
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
