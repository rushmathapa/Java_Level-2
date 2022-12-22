package FileHandlingException;

public class CountAge extends Exception{

	public void countAge(int age) throws AgeException {
		if (age >= 18) {
			System.out.println("Congratulation!! you are eligible to vote");
		} else {
			throw new AgeException("Sorry you are not eligible");
		}
	}
}
