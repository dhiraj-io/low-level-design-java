public class clientEnum {

    public static void main(String[] args) {

        // usage — no new, no getInstance(), just INSTANCE
        DbConnectionPoolEnum pool1 = DbConnectionPoolEnum.INSTANCE;
        DbConnectionPoolEnum pool2 = DbConnectionPoolEnum.INSTANCE;

        System.out.println(pool1 == pool2); // true — same instance always

        pool1.connect(); // Connected to DB: url
    }
}
