public class NotificationManager {

    private UserRepository userRepository; /// we can use this interface to make different types of repos and make services depending on it
//    private EmailService emailService;
//    private SlackService slackService;

    public NotificationManager(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void process( Notification notification) {

        /// we can seperate this code of loction in other classes to validate it (SRP)
        // GDPR logic mixed with validation
//            if (userRepository.getLocation(notification.getUserId()).equals("EU")) {
//                System.out.println("Filtered PROMOTION for EU user");return;
//           }

        notification.SendNotification();
    }
}


