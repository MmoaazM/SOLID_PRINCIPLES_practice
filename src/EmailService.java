public class EmailService implements MessageService {
    public void send(String target,String content)
    {
        //  Email code here to written
    }
    public  String renderMessage(String id)
    {
        return "[EMAIL] Notification" +id;
    }
}