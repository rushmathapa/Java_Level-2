package VotingPackage;

import java.util.Scanner;

public class LogIn {
	public void getLogIn_v() {

		while (true) {
			System.out.println("Enter the voter username for login:");
			Scanner scan = new Scanner(System.in);
			String username = scan.nextLine();

			System.out.println("Enter the password");
			String password = scan.nextLine();

			if ((username.equals("voter") && password.equals("123"))) {
				System.out.println("User is able to login the system");

				break;

			} else {
				System.out.println("Invalid authentication..Please try again!!\n\n");

			}
			continue;

		}

	}
}
