import Email.Email;
import Invoice.Invoice;
import Order.Order;

public class Main {
	public static void main(String[] args) {
		Order order = new Order();
		order.calculateTotal(10.0, 2);
		order.placeOrder("John Doe", "123 Main St");

		Invoice invoice = new Invoice();
		invoice.generateInvoice("order_123.pdf");

		Email email = new Email();
		email.sendEmailNotification("johndoe@example.com");
	}
}
