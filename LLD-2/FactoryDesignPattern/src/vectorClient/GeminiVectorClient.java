package vectorClient;

public class GeminiVectorClient implements AiVectorClient {
    @Override
    public void embed(String text) {
        System.out.println("Gemini embedding for: " + text);
    }
}
