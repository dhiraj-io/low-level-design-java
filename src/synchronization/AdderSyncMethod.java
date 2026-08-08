package synchronization;

import java.util.concurrent.Callable;

public class AdderSyncMethod implements Callable<Void> {

    private Value2 v;

    AdderSyncMethod(Value2 val)
    {
        this.v = val;
    }
    @Override
    public Void call() throws Exception {
        for(int i = 1; i<=100; i++)
        {
                v.Increment();
        }
        return null;
    }
}
