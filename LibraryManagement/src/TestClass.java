public class TestClass implements Lendable{
    @Override
    public boolean lend(User user) {
        return false;
    }

    @Override
    public void returnItem(User user) {

    }

    @Override
    public boolean isAvailable() {
        return false;
    }
}
