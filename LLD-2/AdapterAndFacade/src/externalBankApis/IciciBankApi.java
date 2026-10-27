package externalBankApis;

public class IciciBankApi {
    public void transfer(String accountNo, int amount, String token)
    {
        System.out.println("Sending money from ICICI Bank: " + accountNo + " amount = " + amount + " token = " + token);
    }

    public int seeBalance(String accountNo)
    {
        System.out.println("Balance from the ICICI = 10000");
        return  10000;
    }
}
