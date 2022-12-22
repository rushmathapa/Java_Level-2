package EmployementManagementSystem.copy;

import java.util.Scanner;

public class LogInOut {
	
	public boolean getLogIn() {
		
		System.out.println("Enter the username for login");
		Scanner scan = new Scanner (System.in);
		String username1 = scan.nextLine();
		System.out.println("Enter the password");
		String password1 = scan.nextLine();
		
		if(("admin".equals(username1) && "1234".equals(password1))) {
			System.out.println("User is able to login the system");
			return true;
		}
		else {
			System.out.println("Incorrect username and password.Please try again!!");
			return false;
		}
	}
	

}
