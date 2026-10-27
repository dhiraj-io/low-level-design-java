import externalBankApis.IciciBankApi;

import java.util.UUID;

public class IciciBankAdapter implements BankApi{

    static {
        System.out.println("IciciBankAdapter static block loaded!");
        adapterRegistry.register("icici", IciciBankAdapter :: new);
    }
    private IciciBankApi iciciBankApi;
    public IciciBankAdapter() {
        this.iciciBankApi = new IciciBankApi();
    }


    @Override
    public void send(String accountNo, int amount) {
        // generate token
        String token  = generateToken();
        iciciBankApi.transfer(accountNo, amount, token);
    }

    private String generateToken()
    {
        return UUID.randomUUID().toString();
    }
    @Override
    public int fetchBalance(String accountNo) {
        return iciciBankApi.seeBalance(accountNo);
    }
}
