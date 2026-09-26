package factory;

import chatClients.AiChatClient;
import chatClients.GeminiChatClient;
import vectorClient.AiVectorClient;
import vectorClient.GeminiVectorClient;

// Added by a DIFFERENT TEAM — zero changes to any existing file
public class GeminiClientFactory implements AiClientFactory {

    static {
        ClientFactoryProvider.register("gemini", new GeminiClientFactory());
    }

    @Override
    public AiChatClient getAiChatClient() {
        return new GeminiChatClient();
    }

    @Override
    public AiVectorClient getAiVectorClient() {
        return new GeminiVectorClient();
    }
}
