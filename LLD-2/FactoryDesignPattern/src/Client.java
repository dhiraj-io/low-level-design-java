// trigger class loading so static blocks run and factories self-register
import factory.OpenAiClientFactory;
import factory.AnthropicClientFactory;
import factory.GeminiClientFactory;

public class Client {

    public static void main(String[] args) {

        // test all 3 providers
        String[] providers = {"openai", "anthropic", "gemini"};

        for (String provider : providers) {
            System.out.println("--- Provider: " + provider + " ---");
            ChatService service = new ChatService(provider);
            service.chat("Hello!");
            service.embed("some text");
        }
    }
}
