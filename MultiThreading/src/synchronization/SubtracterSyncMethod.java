package synchronization;

import java.util.concurrent.Callable;

public class SubtracterSyncMethod implements Callable<Void> {

    private Value2 v;


    SubtracterSyncMethod(Value2 val)
    {
        this.v = val;
    }
    @Override
    public Void call() throws Exception {
        for(int i = 1; i<=100; i++)
        {
           v.Decrement();
        }
        return null;
    }
}
