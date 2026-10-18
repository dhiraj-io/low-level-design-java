package factory.simpleFactory;

import chatClients.AiChatClient;
import chatClients.AnthropicChatClient;
import chatClients.GeminiChatClient;
import chatClients.OpenAiChatClient;

public class ChatClientFactory {

    public static AiChatClient getAiChatClient(String providerName) {
        if (providerName.equals("openai"))     return new OpenAiChatClient();
        if (providerName.equals("anthropic"))  return new AnthropicChatClient();
        if (providerName.equals("gemini"))     return new GeminiChatClient();
        throw new RuntimeException("Unknown provider: " + providerName);
    }
}
