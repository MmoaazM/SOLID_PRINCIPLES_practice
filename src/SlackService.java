public class SlackService implements MessageService {
    public void send(String target,String content)
    {
        //  Slack code here to written
    }
    public  String renderMessage(String id)
    {
        return "[SLACK] Notification" +id;
    }
}