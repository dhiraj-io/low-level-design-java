package factory;

import chatClients.AiChatClient;
import chatClients.AnthropicChatClient;
import vectorClient.AiVectorClient;
import vectorClient.AnthropicVectorClient;

public class AnthropicClientFactory implements AiClientFactory {

    static {
        ClientFactoryProvider.register("anthropic", new AnthropicClientFactory());
    }

    @Override
    public AiChatClient getAiChatClient() {
        return new AnthropicChatClient();
    }

    @Override
    public AiVectorClient getAiVectorClient() {
        return new AnthropicVectorClient();
    }
}
