public class clientDCL {

   public static void main(String[] args) {

        DbConnectionPoolDoubleCheckLock pool1 = DbConnectionPoolDoubleCheckLock.getInstance();
        DbConnectionPoolDoubleCheckLock pool2 = DbConnectionPoolDoubleCheckLock.getInstance();

        if(pool1 == pool2)
            System.out.println("Double check lock is working");
    }
}
