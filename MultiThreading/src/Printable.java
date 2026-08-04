public class Printable implements  Runnable{

    void print()
    {
        for(int i = 0; i<100; i++)
        {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(i);
        }
    }
    @Override
    public void run() {
        print();
    }
}
