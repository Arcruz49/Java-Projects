import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class principal{
	
	public static Worker addWorker(Scanner teclado) {
		
		System.out.println("Enter the departament name:");
		String departamentName = teclado.nextLine();
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String workerName = teclado.nextLine();
		System.out.print("Level: ");
		String workerLevel = teclado.nextLine();
		System.out.println("Base salary: ");
		double baseSalary = teclado.nextDouble();
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament(departamentName));
		return worker;
	}
	
	public static void addContract (Scanner teclado, SimpleDateFormat sdf, Worker worker) throws ParseException {
		System.out.println("How many contracts to this worker?");
		int n = teclado.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter contract #"+ i +" data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(teclado.next());
			System.out.print("Value per hour: ");
			double valuePerHour = teclado.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = teclado.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);	
		}
	}
	
	public static void calculateIncome(Scanner teclado, Worker worker) {
		System.out.println();
		System.out.println("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = teclado.next();
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: "+ worker.getName());
		System.out.println("Departament: "+ worker.getDepartament().getName());
		System.out.println("Income for "+ monthAndYear+ ": " + String.format("%.2f", worker.income(year, month)));
	}
	
	public static void main(String[] args) throws ParseException{
		
		Scanner teclado = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Worker worker = addWorker(teclado);
		addContract(teclado, sdf, worker);
		calculateIncome(teclado, worker);
				
		teclado.close();
		
	}
}
