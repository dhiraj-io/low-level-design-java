package factory;

import chatClients.AiChatClient;
import vectorClient.AiVectorClient;

// Abstract Factory — creates a FAMILY of related objects (chat + vector)
// guarantees both clients are from the same provider
public interface AiClientFactory {
    AiChatClient getAiChatClient();
    AiVectorClient getAiVectorClient();
}
