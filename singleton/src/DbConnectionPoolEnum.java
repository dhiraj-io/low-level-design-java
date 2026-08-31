import java.util.ArrayList;
import java.util.List;

// ENUM SINGLETON — best implementation (Joshua Bloch, Effective Java)
// Thread-safe: JVM guarantees enum values are created only once
// Serialization-safe: JVM never duplicates enum values during deserialize
// Reflection-safe: JVM blocks newInstance() on enums → IllegalArgumentException
public enum DbConnectionPoolEnum {

    INSTANCE; // only one value — this IS the singleton

    private String url;
    private String password;
    private List<String> connections;
    private int maxPoolSize;

    // enum constructor is always private by default — no need to write private
    DbConnectionPoolEnum() {
        this.url = "url";
        this.password = "pass";
        this.maxPoolSize = 5;
        this.connections = new ArrayList<>(maxPoolSize);
        System.out.println("DbConnectionPoolEnum instance created");
    }

    public String getUrl() { return url; }
    public String getPassword() { return password; }
    public int getMaxPoolSize() { return maxPoolSize; }

    public void connect() {
        System.out.println("Connected to DB: " + url);
    }
}
