public class alertNotification extends Notification{
    private Integer priority;
    alertNotification(MessageService message, String id, String userId, String Target, Integer priority)
    {
        super(message,id,userId,Target);
        this.priority=priority;
    }
    public Integer getPriority() { return priority; }

    @Override
    public void SendNotification() {

        /// logic for AlertNotification

            _message.send(this.target, _message.renderMessage(this.id));

    }
}
