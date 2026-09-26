package factory;

import chatClients.AiChatClient;
import chatClients.OpenAiChatClient;
import vectorClient.AiVectorClient;
import vectorClient.OpenAiVectorClient;

public class OpenAiClientFactory implements AiClientFactory {

    // self-registration — runs once when JVM loads this class
    // ClientFactoryProvider never needs to know about this class
    static {
        ClientFactoryProvider.register("openai", new OpenAiClientFactory());
    }

    @Override
    public AiChatClient getAiChatClient() {
        return new OpenAiChatClient();
    }

    @Override
    public AiVectorClient getAiVectorClient() {
        return new OpenAiVectorClient();
    }
}
