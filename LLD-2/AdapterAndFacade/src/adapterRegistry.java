import java.util.HashMap;
import java.util.function.Supplier;

public class adapterRegistry {

    private static HashMap<String, Supplier<BankApi>> registry = new HashMap<>();

    public static void register(String bankName, Supplier<BankApi> supplier)
    {
        registry.putIfAbsent(bankName, supplier);
    }

    public static BankApi getAdapter(String bankName)
    {
        return registry.get(bankName).get();
    }
}
