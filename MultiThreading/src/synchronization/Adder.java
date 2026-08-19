package synchronization;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {

    private Value v;
    private Lock lock;

    Adder(Value val, Lock lock)
    {
        this.v = val;
        this.lock = lock;
    }
    @Override
    public Void call() throws Exception {
       for(int i = 1; i<=100; i++)
       {
           lock.lock();
           v.x = v.x + 1;
           lock.unlock();
       }
       return null;
    }
}
