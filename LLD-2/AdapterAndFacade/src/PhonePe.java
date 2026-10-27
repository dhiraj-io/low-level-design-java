

public class PhonePe {

    private BankApi bankApi;


    public PhonePe(String bankName) {
        this.bankApi = adapterRegistry.getAdapter(bankName);
    }

    public void moneyTransfer(String accountNo, int amount)
    {
        bankApi.send(accountNo, amount);
    }

    public int fetchBalance(String accountNo)
    {
        return bankApi.fetchBalance(accountNo);
    }
}
