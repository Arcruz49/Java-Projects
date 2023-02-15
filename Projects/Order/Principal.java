import java.util.Date;
import java.util.Scanner;
import java.io.DataOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Principal{
	
	public static void main(String[] args) throws ParseException{
		Scanner teclado = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = teclado.nextLine();
		System.out.print("Email: ");
		String email = teclado.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthdate = sdf.parse(teclado.next());
		
		Client c1 = new Client(name, email, birthdate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(teclado.next());
		
		Order order = new Order(new Date(), status, c1);
		
		System.out.print("How many items to this order? ");
		int n = teclado.nextInt();
		
		for (int i = 1; i <= n; i++){
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			teclado.nextLine();
			String productName = teclado.nextLine();
			System.out.print("Product price: ");
			double productPrice = teclado.nextDouble();
			System.out.print("Quantity: ");
			int quantity = teclado.nextInt();
			
			Product product = new Product(productName, productPrice);
			OrderItem it = new OrderItem(quantity, productPrice, product);
			order.addItem(it);
		}
		
		System.out.println();
		System.out.println(order);
		
		teclado.close();
		
	}
}
