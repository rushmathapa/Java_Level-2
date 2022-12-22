package FileHandlingException;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner("System.in");
		System.out.println("Enter your Age");
		int age = scan.nextInt();
		CountAge count = new CountAge();
		try {
			count.countAge(age);
		}
		catch(AgeException e) {
			System.out.println(e.getMessage());
		}
	}

}
