package banking_system;

import java.sql.Connection;
import java.util.Scanner;

public class User {
private Scanner scanner;
private Connection connection;
	
	public User(Connection connection, Scanner scanner) {
		this.connection=connection;
	    this.scanner=scanner;
}
	public void register() {
		System.out.println("full Name: ");
		String full_name=scanner.nextLine();
		System.out.println("Email: ");
		String email=scanner.nextLine()
;		System.out.println("Password: ");
        String password=scanner.nextLine();
		if(user_exist(email)) {
   System.out.println("User Already Exists for this Email Address!!");
            return;
		}
	}
	public String login() {
		System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
		return null;
	}
	public boolean user_exist(String email) {
		return false;
	}
	
}
