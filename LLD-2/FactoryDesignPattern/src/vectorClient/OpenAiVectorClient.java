package vectorClient;

public class OpenAiVectorClient implements AiVectorClient {
    @Override
    public void embed(String text) {
        System.out.println("OpenAI embedding for: " + text);
    }
}
