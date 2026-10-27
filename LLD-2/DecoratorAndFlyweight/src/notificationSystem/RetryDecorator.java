package notificationSystem;

public class RetryDecorator extends NotificationDecorator{

    private final int MAX_COUNT = 5;
    public RetryDecorator(Notification wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String user, String message) {
        int cnt = 0;
        while (cnt < MAX_COUNT) {
            try {
                int j = 5/0;
                wrapped.send(user, message);
                System.out.println("Message sent");
                return;
            } catch (Exception e) {
                cnt++;
                System.out.println("Message failed. Retrying... attempt " + cnt);
                if (cnt == MAX_COUNT) {
                    throw e;
                }
            }
        }
    }
}
