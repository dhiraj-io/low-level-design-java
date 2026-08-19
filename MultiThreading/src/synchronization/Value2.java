package synchronization;

public class Value2 {

    private int x;

    public synchronized void Increment() {
        this.x = this.x + 1;
    }

    public synchronized void Decrement()
    {
        this.x = this.x - 1;
    }

    public int getX()
    {
        return x;
    }
}
