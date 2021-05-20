package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.CaseException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data: ");
		
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		String holder = sc.next();
		System.out.print("Initial balance: ");
		Double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withDraw = sc.nextDouble();
		
		Account account = new Account(number, holder, balance, withDraw);
		
		System.out.print("Enter amount for withdraw: ");
		double ammount = sc.nextDouble();	
		
		try {
			account.withDraw(ammount);
			
			System.out.println("New Balance: " + String.format("%.2f", account.getBalance()));
			
		} catch (CaseException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		sc.close();

	}

}
