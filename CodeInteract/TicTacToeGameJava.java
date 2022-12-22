import java.util.Scanner;

public class TicTacToeGameJava {

	private static int pos2y;

	public static void main(String[] args) {
		String[][]matrix = {{ " ", " "," " }, { " ", " "," " }, 
							 { " ", " "," " }};
		String player1 = "x";
		String player2 = "0";
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " | ");
			}
			System.out.println();
		}
		while(true) {
		System.out.println("Let the game begin !!");
		System.out.println("Enter the position of row for 1st player");
		Scanner scan = new Scanner(System.in);
		int posx = scan.nextInt();
		System.out.println("Enter the position of column");
		int posy = scan.nextInt();
		matrix[posx][posy] = "x";
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.println(matrix[i][j]);
			}
			
		}
		System.out.println("Enter the position x for 2nd player");
		int pos1x = scan.nextInt();
		System.out.println("Enter the position of column");
		int pos2y = scan.nextInt();
		matrix[pos1x][pos2y] = "0";
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.println(matrix[i][j]);
			}
			
		}
		
	}}
}