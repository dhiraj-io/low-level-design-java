package callable;

import java.util.concurrent.Callable;

public class numberMultiplier implements Callable<Integer> {

    private int val;

    numberMultiplier(int val)
    {
        this.val = val;
    }
    @Override
    public Integer call() throws Exception {
        Thread.sleep(10000);
        return 5*val;
    }
}
