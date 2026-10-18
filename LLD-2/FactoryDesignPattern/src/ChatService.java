import chatClients.AiChatClient;
import factory.AiClientFactory;
import factory.ClientFactoryProvider;
import vectorClient.AiVectorClient;

import java.util.List;

public class ChatService {

    private AiChatClient aiChatClient;
    private AiVectorClient aiVectorClient;
    private List<String> providers;
    private AiClientFactory aiClientFactory;

    public ChatService(List<String> providers) {
        this.providers = providers;
        for (String provider : providers) {
            try {
                aiClientFactory = ClientFactoryProvider.getAiClientFactory(provider);
                this.aiChatClient = aiClientFactory.getAiChatClient();
                this.aiVectorClient = aiClientFactory.getAiVectorClient();
                break; // first provider that works — stop here
            } catch (Exception e) {
                System.out.println(provider + " unavailable, trying next...");
            }
        }
        if (aiChatClient == null) {
            throw new RuntimeException("No AI provider available");
        }
    }

    public void chat(String prompt) {
        aiChatClient.chat(prompt);
    }

    public void embed(String text) {
        aiVectorClient.embed(text);
    }
}
