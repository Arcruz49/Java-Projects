import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal{
	
	public static void addTaxPayer(Scanner teclado, List<Pessoa> list) {
		System.out.print("Enter the number of tax payers: ");
		int n = teclado.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Tax payer #"+i+" data:");
			System.out.print("Individual or company (i/c)? ");
			char type = teclado.next().charAt(0);
			teclado.nextLine();
			System.out.print("Name: ");
			String name = teclado.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = teclado.nextDouble();
			
			if(type == 'i' || type == 'I') {
				System.out.print("Health expeditures: ");
				double healthExpenditures = teclado.nextDouble();
				Pessoa pessoa = new PessoaFisica(name, anualIncome, healthExpenditures);
				list.add(pessoa);
			}
			else {
				System.out.print("Number of employees: ");
				Integer numberEmployees = teclado.nextInt(); 
				Pessoa pessoa = new PessoaJuridica(name, anualIncome, numberEmployees);
				list.add(pessoa);
			}
		}
	}
	
	public static void readTaxesPaid(List<Pessoa> list) {
		double total = 0;
		System.out.println();
		System.out.println("TAXES PAID:");
		
		for (Pessoa pessoa : list) {
			System.out.printf(pessoa.getNome()+": $ "+ "%.2f", pessoa.impostoPago());
			System.out.println();
			total = total + pessoa.impostoPago();
		}
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + total);
	}
	
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		List<Pessoa> list = new ArrayList<Pessoa>();
		
		addTaxPayer(teclado, list);
		readTaxesPaid(list);
		
		teclado.close();
		
	}
}
