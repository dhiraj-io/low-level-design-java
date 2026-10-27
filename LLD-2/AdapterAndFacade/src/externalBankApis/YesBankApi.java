package externalBankApis;

public class YesBankApi {

    public void makeTransaction(String accountNo, int amount)
    {
        System.out.println("Sending money from Yes Bank: " + accountNo + " amount = " + amount);
    }

    public int getBalance(String accountNo)
    {
        System.out.println("Balance from the YesBank = 5000");
        return  5000;
    }
}
