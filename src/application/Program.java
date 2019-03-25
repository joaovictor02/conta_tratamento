package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter account data:");
			System.out.print("Number: ");
			int number = sc.nextInt();sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			Double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = sc.nextDouble();
			System.out.println();
			
			Account account = new Account(number, holder, balance, withdrawLimit);

			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			account.withdraw(amount);
			
			System.out.println("New balance: "+account.getBalance());
			/* TRATAR EXCEÇÕES NAO FASER SAQUE MAIOR QUE LIMITE OU SE O SAUDO FOR 0 */
		} catch (DomainException e) {
			System.out.println("Error: " + e.getMessage());
		}catch(RuntimeException e) {
			System.out.println("Unexpected error");
		}

		sc.close();
	}

}
