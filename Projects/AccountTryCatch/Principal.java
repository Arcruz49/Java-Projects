package application;

import model.entities.DomainException;
import model.entities.Account;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = teclado.nextInt();
			System.out.print("Holder: ");
			String holder = teclado.nextLine();
			teclado.nextLine();
			System.out.print("Initial balance: ");
			double initialBalance = teclado.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = teclado.nextDouble();
			
			Account account = new Account(number, holder, initialBalance, withdrawLimit);
			
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double amount = teclado.nextDouble();
			account.withdraw(amount);
			System.out.println("New balance: "+account.getBalance());
		}
		
		catch (DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
		
		teclado.close();
	}
}
