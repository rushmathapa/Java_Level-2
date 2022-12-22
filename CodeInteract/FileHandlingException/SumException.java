package FileHandlingException;

import java.util.Scanner;

public class SumException extends Exception {
	String s;

	SumException(String s) {
		super(s);

	}

	class main {
		int score1;
		int score2;

		public static int sumOfTwoScores(int score1, int score2) throws SumException {
			if ((score1 + score2) > 0) {
				return (score1 + score2);

			} else {
				throw new SumException("0");
			}
		}

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter scores1");
			int score1 = scan.nextInt();
			System.out.println("Enter the scores2");
			int score2 = scan.nextInt();
			try {
				System.out.println(sumOfTwoScores(score1, score2));
			} catch (SumException e) {
				System.out.println("Score is less than 0");
			}
		}

	}
}