package ResturantMgmtSystem;

import java.util.Scanner;

public class LogInOut {
	
	public void getLogIn() {
		System.out.println("Enter the username for login");
		Scanner scan = new Scanner (System.in);
		String username = scan.nextLine();
		System.out.println("Enter the password");
		String password = scan.nextLine();
		
		if(("admin".equals(username) && "1234".equals(password))) {
			System.out.println("User is able to login the system");
		}
		else {
			System.out.println("Incorrect username and password.Please try again!!");
		}
	}
	

}
