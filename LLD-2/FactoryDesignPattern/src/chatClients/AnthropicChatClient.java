package chatClients;

public class AnthropicChatClient implements AiChatClient {
    @Override
    public void chat(String prompt) {
        System.out.println("Response from Anthropic: " + prompt);
    }
}
