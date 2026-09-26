package vectorClient;

public class AnthropicVectorClient implements AiVectorClient {
    @Override
    public void embed(String text) {
        System.out.println("Anthropic embedding for: " + text);
    }
}
