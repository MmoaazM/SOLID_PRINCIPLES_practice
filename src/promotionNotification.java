import java.time.LocalDate;

public class promotionNotification extends Notification{
    private LocalDate expiryDate;
    promotionNotification(MessageService message, String id, String userId, String Target, LocalDate expiryDate)
    {
        super(message,id,userId,Target);
        this.expiryDate=expiryDate;


    }
    public LocalDate getExpiryDate() { return expiryDate; }

    @Override
    public void SendNotification() {

        ///  logic for PromotionNotification
        _message.send(this.target, _message.renderMessage(this.id));
    }
}
