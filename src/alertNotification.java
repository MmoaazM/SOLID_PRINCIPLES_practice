public class alertMessage extends Notification{
    private Integer priority;
    alertMessage(MessageType message,String id, String userId,String Target,Integer priority)
    {
        super(message,id,userId,Target);
        this.priority=priority;
    }
    public Integer getPriority() { return priority; }
}
