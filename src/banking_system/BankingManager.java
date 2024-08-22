package banking_system;

import java.sql.Connection;
import java.util.Scanner;

public class BankingManager {
 private Scanner scanner;
 private Connection connection;
	 public BankingManager(Connection connection,Scanner scanner) {
		this.connection=connection;
		this.scanner=scanner;
	}

	public void credit_money(long account_number) {
		 System.out.print("Enter Amount: ");
	     double amount = scanner.nextDouble();
	     scanner.nextLine();
	     System.out.print("Enter Security Pin: ");
	     String security_pin = scanner.nextLine();
	 }
	public void debit_money(long account_number) {
		System.out.print("Enter Amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter Security Pin: ");
        String security_pin = scanner.nextLine();
	}
	public void transfer_money(long sender_account_number){
        scanner.nextLine();
        System.out.print("Enter Receiver Account Number: ");
        long receiver_account_number = scanner.nextLong();
        System.out.print("Enter Amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();  
        System.out.print("Enter Security Pin: ");
        String security_pin = scanner.nextLine();
}
	public void getBalance(long account_number){
        scanner.nextLine();
        System.out.print("Enter Security Pin: ");
        String security_pin = scanner.nextLine();
}
}
