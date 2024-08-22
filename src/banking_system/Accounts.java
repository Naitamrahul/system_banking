package banking_system;

import java.sql.Connection;
import java.util.Scanner;

public class Accounts {
 private Scanner scanner;
 private Connection connection;
	public Accounts(Connection connection,Scanner scanner) {
		this.connection=connection;
		this.scanner=scanner;
	}
	public long open_account(String email) {
		System.out.print("Enter Full Name: ");
        String full_name = scanner.nextLine();
        System.out.print("Enter Initial Amount: ");
        double balance = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter Security Pin: ");
        String security_pin = scanner.nextLine();
		return 0;	
	}
	public long getAccount_number(String email) {
		return 0;
	}
	private long generateAccountNumber() {
		return 0;
		
	}
	public boolean account_exist(String email) {
		return false;
		
	}
	
}
