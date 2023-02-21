import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
public class Principal{

	public static void addProduct(int i, Scanner teclado, SimpleDateFormat sdf, List<Product> list) throws ParseException{
		System.out.println("Product "+i+"# data: ");
		System.out.print("Common, used, or imported (c/u/i)? ");
		char answer = teclado.next().charAt(0);
		teclado.nextLine();
		System.out.print("Name: ");
		String name = teclado.nextLine();
		System.out.print("Price: ");
		double price = teclado.nextDouble();
		
		if(answer == 'c' || answer == 'C') {
			Product product = new Product(name, price);
			list.add(product);
		}
		if(answer == 'u'|| answer == 'U') {
			System.out.print("Manufacture date (DD/MM/YYYY): ");
			Date date = sdf.parse(teclado.next());
			Product product = new UsedProduct(name,price,date);
			list.add(product);
		}
		if( answer == 'i' || answer == 'I') {
			System.out.print("Customs fee: ");
			double customsFee = teclado.nextDouble();
			Product product = new importedProduct(name,price,customsFee);
			list.add(product);
		}

	}
	
	public static void readProducts(List <Product> list) {
		System.out.println("PRICE TAGS:");
		for(Product product : list) {
			System.out.println(product.priceTag());
		}
			
	}
	
	public static void main(String[] args) throws ParseException{
		Scanner teclado = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> list = new ArrayList<Product>();
		
		System.out.print("Enter the number of products: ");
		int numberOfProducts = teclado.nextInt();
		
		for(int i = 1; i <= numberOfProducts; i++ ) {
			addProduct(i,teclado,sdf,list);
		}
		
		readProducts(list);
		
		teclado.close();
		
	}
}
