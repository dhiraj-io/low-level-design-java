import java.util.ArrayList;
import java.util.List;

public class DbConnectionPoolDoubleCheckLock {
    private String url;
    private String password;
    private List<String> connections;
    private int maxPoolSize;

    // DCL (Double Checked Locking) — lazy initialization, instance starts as null.
    // volatile prevents CPU instruction reordering — without it, a partially
    // constructed object can be returned to another thread.
    // No final here — instance starts null and gets assigned later inside getInstance().
    private static volatile DbConnectionPoolDoubleCheckLock instance;

    // private constructor — prevents anyone outside from calling new DbConnectionPool(...)
    // This is the KEY to Singleton — without this, anyone can create multiple objects
    private DbConnectionPoolDoubleCheckLock(String url, String password, int maxPoolSize) {
        this.url = url;
        this.password = password;
        this.maxPoolSize = maxPoolSize;
        this.connections = new ArrayList<>(maxPoolSize);
        System.out.println("DbConnectionPool instance created"); // proof of when constructor runs
    }

    // Check 1 (outside sync): avoids acquiring lock on every call — performance optimization.
    // Check 2 (inside sync): guards against two threads both passing check 1 simultaneously.
    // synchronized block ensures only one thread creates the instance.
    public static DbConnectionPoolDoubleCheckLock getInstance()
    {
        if(instance == null)
        {
            synchronized (DbConnectionPoolDoubleCheckLock.class)
            {
                if(instance == null)
                {
                    instance = new DbConnectionPoolDoubleCheckLock("url", "pass", 5);
                }
            }
        }
        return instance;
    }
}
