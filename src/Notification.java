public abstract class Notification {
    protected String id;
    protected String userId;
    protected String target;
    protected MessageService _message; /// interface refer to email or Slack message

    public Notification(MessageService message, String id, String userId, String target) {
        this._message=message;
        this.id = id;
        this.userId = userId;
        this.target = target;
    }

    public String getId() { return id; }
    public String getUserId() { return userId; }
    public String getTarget() { return target; }


    public abstract void SendNotification();

}
