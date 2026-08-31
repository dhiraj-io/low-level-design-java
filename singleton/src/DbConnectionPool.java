import java.util.ArrayList;
import java.util.List;

public class DbConnectionPool {
    private String url;
    private String password;
    private List<String> connections;
    private int maxPoolSize;

    // EAGER LOADING — instance created when class is loaded by JVM,
    // even before getInstance() is called. Thread-safe by JVM guarantee.
    // Use final because this reference should never be reassigned.
    private static final DbConnectionPool instance = new DbConnectionPool("url", "pass", 5);

    // private constructor — prevents anyone outside from calling new DbConnectionPool(...)
    // This is the KEY to Singleton — without this, anyone can create multiple objects
    private DbConnectionPool(String url, String password, int maxPoolSize) {
        this.url = url;
        this.password = password;
        this.maxPoolSize = maxPoolSize;
        this.connections = new ArrayList<>(maxPoolSize);
        System.out.println("DbConnectionPool instance created"); // proof of when constructor runs
    }

    // single access point — always returns the same pre-created instance
    // no null check needed because instance is never null (created at class load)
    public static DbConnectionPool getInstance()
    {
        return instance;
    }

    // calling this static method loads the class → triggers eager instance creation
    // even though we never called getInstance() — this proves "eager" behaviour
    public static void sayHello()
    {
        System.out.println("Hello");
    }
}
