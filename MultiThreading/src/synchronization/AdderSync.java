package synchronization;

import java.util.concurrent.Callable;

public class AdderSync implements Callable<Void> {

    private Value v;

    AdderSync(Value val)
    {
        this.v = val;
    }
    @Override
    public Void call() throws Exception {
        for(int i = 1; i<=100; i++)
        {
            synchronized (v) {
                v.x = v.x + 1;
            }
        }
        return null;
    }
}
