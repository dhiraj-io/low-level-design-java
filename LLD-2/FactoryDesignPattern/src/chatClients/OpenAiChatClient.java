package chatClients;

public class OpenAiChatClient implements AiChatClient {
    @Override
    public void chat(String prompt) {
        System.out.println("Response from OpenAI: " + prompt);
    }
}
