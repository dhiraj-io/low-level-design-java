package executors;

public class IndividualNumberPrinter implements Runnable {

    private int num;

    IndividualNumberPrinter(int num)
    {
        this.num = num;
    }
    @Override
    public void run() {
        System.out.println(num);
    }
}
