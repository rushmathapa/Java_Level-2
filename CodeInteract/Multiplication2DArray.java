import java.util.Scanner;

public class Multiplication2DArray {

	public static void main(String[] args) {
		System.out.println("Enter number of rows");
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		System.out.println("Enter total size of Column ");
		int column = scan.nextInt();
		int[][] arraysize = new int[row][column];
		for (int i = 0; i < arraysize.length; i++) {
			for (int j = 0; j < arraysize[i].length; j++) {
				System.out.println("Enter number in rows and column ");
				int num = scan.nextInt();
				arraysize[i][j] = num;
			}

		}
		for (int i = 0; i < arraysize.length; i++) {
			for (int j = 0; j < arraysize[i].length; j++) {
				System.out.print(arraysize[i][j] + " ");
			}
			System.out.println();

		}
		System.out.println("Enter number of rows for 2nd matrix");
		int row2 = scan.nextInt();
		System.out.println("Enter number of column for 2nd matrix");
		int column2 = scan.nextInt();
		int[][] arraysize2 = new int[row2][column2];
		for (int i = 0; i < arraysize2.length; i++) {
			for (int j = 0; j < arraysize2[i].length; j++) {
				System.out.println("Enter the total number in row2 and column2");
				int num2 = scan.nextInt();
				arraysize2[i][j] = num2;
			}
		}
		for (int i = 0; i < arraysize2.length; i++) {
			for (int j = 0; j < arraysize2[i].length; j++) {
				System.out.print(arraysize2[i][j] + " ");
			}
			System.out.println();
		}
		if (arraysize[0].length != arraysize2.length) {
			System.out.println("multiplication can be done only when 1st matrix of columnlength = row of 2nd matrix");
		} else {
			int[][] answer = new int[arraysize.length][arraysize2.length];
			for (int i = 0; i < answer.length; i++) {
				for (int j = 0; j < answer[i].length; j++) {
					for (int k = 0; k < arraysize[0].length; k++) {
						answer[i][j] += arraysize[row][i] * arraysize2[i][column];
						System.out.println(answer[i][j]);
					}
				}

			}

		}

	}
}
