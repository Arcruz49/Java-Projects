import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Principal{
	
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Enter the number of employees: ");
		int n = teclado.nextInt();
		char answer;
		List<Employee>list = new ArrayList<Employee>();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Employee #"+i+" data:");
			System.out.print("Outsourced (y/n)?");
			answer = teclado.next().charAt(0);
			System.out.print("Name: ");
			teclado.nextLine();
			String name = teclado.nextLine();
			System.out.print("Hours: ");
			Integer hours = teclado.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = teclado.nextDouble();
			
			if(answer == 'y' || answer == 'Y') {
				System.out.print("Aditional charge: ");
				double aditionalcharge = teclado.nextDouble();
				Employee employee = new OutsourcedEmployee(name, hours, valuePerHour, aditionalcharge);
				list.add(employee);
			}
			else {
				Employee employee = new Employee(name, hours, valuePerHour);
				list.add(employee);
			}
			
		}
		System.out.println();
		System.out.println("PAYMENTS:");
		for(Employee employee : list) {
			System.out.println(employee.getName()+" - $ " + employee.payment());
		}
		
		teclado.close();
		
	}
}
