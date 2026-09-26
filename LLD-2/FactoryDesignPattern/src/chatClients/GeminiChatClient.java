package chatClients;

public class GeminiChatClient implements AiChatClient {
    @Override
    public void chat(String prompt) {
        System.out.println("Response from Gemini: " + prompt);
    }
}
