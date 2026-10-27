package notificationSystem;

public class client {
   public static void main(String[] args) {
//        Notification notification = new Email();
//
//        notification.send("TestUser", "Hello");

       // email notifcation with logging
//       Notification notification = new Email();
//       Notification n = new LoggingDecorator(notification);
//       n.send("TestUser", "Hello");

       // email with retry
       Notification notification1 = new Email();
       Notification notification2 = new RetryDecorator(notification1);
       Notification notification = new LoggingDecorator(notification2);
       notification.send("Test1", "Hello");
    }
}
