import java.util.Scanner;
public class client {

    public static void main(String[] args) {

        // Transaction by Yes Bank
//        BankApi yesBankApi = new YesBankAdapter();
//
//        PhonePe phonePe = new PhonePe(yesBankApi);
//
//        phonePe.moneyTransfer("12345", 100000);
//        phonePe.fetchBalance("12345");

        // Transaction via ICICI
//        BankApi iciciBankApi = new IciciBankAdapter();
//
//        PhonePe phonePe = new PhonePe(iciciBankApi);
//
//        phonePe.moneyTransfer("12345", 100000);
//        phonePe.fetchBalance("12345");

//        // using adaptor factor
//        Scanner sc = new Scanner(System.in);
//        String bankName = sc.nextLine();
//
//        PhonePe phonePe1 = new PhonePe(bankName);
//        phonePe1.moneyTransfer("12345", 100000);
//        phonePe1.fetchBalance("12345");

        // using registry factory pattern
        try {
            Class.forName("YesBankAdapter");
            Class.forName("IciciBankAdapter");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner sc = new Scanner(System.in);
        String bankName = sc.nextLine();

        PhonePe phonePe1 = new PhonePe(bankName);
        phonePe1.moneyTransfer("12345", 100000);
        phonePe1.fetchBalance("12345");
    }
}
