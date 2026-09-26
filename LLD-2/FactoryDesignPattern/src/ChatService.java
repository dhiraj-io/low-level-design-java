import chatClients.AiChatClient;
import factory.AiClientFactory;
import factory.ClientFactoryProvider;
import vectorClient.AiVectorClient;

public class ChatService {

    private AiChatClient aiChatClient;
    private AiVectorClient aiVectorClient;

    public ChatService(String provider) {
        // gets the right factory from registry — no if-else needed
        AiClientFactory factory = ClientFactoryProvider.getAiClientFactory(provider);
        this.aiChatClient = factory.getAiChatClient();
        this.aiVectorClient = factory.getAiVectorClient();
    }

    public void chat(String prompt) {
        aiChatClient.chat(prompt);
    }

    public void embed(String text) {
        aiVectorClient.embed(text);
    }
}
