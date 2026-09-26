package factory;

import java.util.HashMap;
import java.util.Map;

// Registry — replaces all if-else chains
// no code change needed when a new provider is added
public class ClientFactoryProvider {

    private static final Map<String, AiClientFactory> registry = new HashMap<>();

    // called by each factory's static block to self-register
    public static void register(String provider, AiClientFactory factory) {
        registry.put(provider, factory);
    }

    public static AiClientFactory getAiClientFactory(String provider) {
        AiClientFactory factory = registry.get(provider);
        if (factory == null) {
            throw new RuntimeException("No factory registered for provider: " + provider);
        }
        return factory;
    }
}
