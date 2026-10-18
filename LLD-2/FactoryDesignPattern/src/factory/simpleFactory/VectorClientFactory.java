package factory.simpleFactory;

import vectorClient.AiVectorClient;
import vectorClient.AnthropicVectorClient;
import vectorClient.GeminiVectorClient;
import vectorClient.OpenAiVectorClient;

public class VectorClientFactory {

    public static AiVectorClient getAiVectorClient(String providerName) {
        if (providerName.equals("openai"))     return new OpenAiVectorClient();
        if (providerName.equals("anthropic"))  return new AnthropicVectorClient();
        if (providerName.equals("gemini"))     return new GeminiVectorClient();
        throw new RuntimeException("Unknown provider: " + providerName);
    }
}
