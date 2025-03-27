package Email;

public class Email implements EmailNotifier {
	@Override
	public void sendEmailNotification(String email) {
		System.out.println("Email notification sent to: " + email);
	}
}
