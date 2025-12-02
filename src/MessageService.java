public interface MessageService {
    void send(String target,String content);
    String renderMessage(String id);
}
