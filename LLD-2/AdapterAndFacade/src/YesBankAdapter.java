import externalBankApis.YesBankApi;

public class YesBankAdapter implements BankApi{

    static {
        System.out.println("YesBankAdapter static block loaded!");
        adapterRegistry.register("yesbank", YesBankAdapter :: new);
    }
    private YesBankApi yesBankApi;

    public YesBankAdapter() {
        this.yesBankApi = new YesBankApi();
    }


    @Override
    public void send(String accountNo, int amount) {
        yesBankApi.makeTransaction(accountNo, amount);
    }

    @Override
    public int fetchBalance(String accountNo) {
        return yesBankApi.getBalance(accountNo);
    }
}
