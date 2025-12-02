public interface MessageType {
    void send(String target,String content);
    String renderMessage(String id);
}
