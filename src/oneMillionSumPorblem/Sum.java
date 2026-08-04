package oneMillionSumPorblem;

import java.util.List;
import java.util.concurrent.Callable;

public class Sum implements Callable<Long> {

    private List<Integer> list;

    Sum(List<Integer> list)
    {
        this.list = list;
    }
    @Override
    public Long call() throws Exception {
        long sum = 0;
        for(int i = 0; i<list.size(); i++)
        {
            sum = sum + list.get(i);
        }
        return  sum;
    }
}
