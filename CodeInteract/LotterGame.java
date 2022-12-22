import java.util.Random;
import java.util.Scanner;

public class LotterGame {

	public static void main(String[] args) {
		Random r = new Random();
		int random[] = new int[5];
		for(int i = 0; i < 5; i++) {
			random[i] = r.nextInt(99)+1;
		}
		Scanner scan = new Scanner(System.in);
		int usernumbers[]=new int[5];
		System.out.println("Enter five numbers");
		for(int i = 0; i < 5; i++){
			usernumbers[i]=scan.nextInt();	
			}
		System.out.println("Random Numbers:");
		for(int i = 0; i < 5; i++ ) {
			System.out.println(random[i] + " ");
			}
		for(int i = 0; i < 5; i++ ) {
			System.out.println(usernumbers[i] + " ");
			}
		int match = 0;
		for(int i = 0; i <5; i++) {
			for(int j = 0; j < 5; j ++) {
				if(random[i]==usernumbers[j]) {
					match++;
				}
			}
		}
		System.out.println("There are " + match + "numbers");
	}

}
