public class client {

    public static void main(String[] args)
    {
        // VERSION 1 — broken: public constructor allows multiple objects
        // DbConnectionPool pool1 = new DbConnectionPool("url1", "pass", 5);
        // DbConnectionPool pool2 = new DbConnectionPool("url1", "pass", 5);
        // pool1 and pool2 are at different memory addresses — Singleton violated

        // VERSION 2 — basic lazy Singleton (not thread-safe)
        // DbConnectionPool pool1 = DbConnectionPool.getInstance();
        // DbConnectionPool pool2 = DbConnectionPool.getInstance();
        // pool1 == pool2 → true, but two threads can both see null and create two objects

        // VERSION 3 — EAGER LOADING (thread-safe)
        // Calling sayHello() loads the class → instance is created immediately
        // even though we never called getInstance()
        // Output: "DbConnectionPool instance created" prints BEFORE "Hello"
        // proving instance was created eagerly at class load time
        DbConnectionPool.sayHello();
    }
}
