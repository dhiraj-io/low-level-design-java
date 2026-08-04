package mergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class sorter implements Callable<List<Integer>> {

    private List<Integer> list;
    private ExecutorService es;
    sorter(List<Integer> list, ExecutorService es)
    {
        this.list = new ArrayList<>(list);
        this.es = es;
    }
    @Override
    public List<Integer> call() throws Exception {

        if(list.size() == 1)
            return list;

        int mid = list.size()/2;
        List<Integer> leftList = list.subList(0, mid);
        List<Integer> rightList = list.subList(mid, list.size());

        sorter leftSorter = new sorter(leftList, es);
        sorter righSorter = new sorter(rightList, es);
        Future<List<Integer>>  leftFuture = es.submit(leftSorter);
        Future<List<Integer>>  rightFuture = es.submit(righSorter);

        List<Integer> leftSorted = leftFuture.get();
        List<Integer> rightSorted = rightFuture.get();

        return merge(leftSorted, rightSorted);
    }

    private List<Integer> merge(List<Integer> left, List<Integer> right)
    {
        List<Integer> ans = new ArrayList<>();

        int l = 0;
        int r = 0;

        while(l < left.size() && r<right.size())
        {
            if(left.get(l) < right.get(r))
            {
                ans.add(left.get(l));
                l++;
            }
            else
            {
                ans.add(right.get(r));
                r++;
            }
        }

        while(l < left.size())
        {
            ans.add(left.get(l));
            l++;
        }

        while(r < right.size())
        {
            ans.add(right.get(r));
            r++;
        }

        return ans;
    }
}
