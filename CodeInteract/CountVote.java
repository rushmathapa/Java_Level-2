import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountVote {

	public static void main(String[] args) {
		int candidate[] = new int[5];
		int errorVote = 0;
		int voters;
		int check = 0;
		int winner = 1;
		int looser = 1;
		String str;
		try {
			BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Election Board");
			System.out.println("Enter number of voters ");
			str = obj.readLine();
			voters = Integer.parseInt(str);
			for(int i = 0; i<=voters;i++) {
				System.out.println("voter given " + i + "to candidate id");
				str = obj.readLine();
				check = Integer.parseInt(str);
				if(check<1 && check >4) {
					errorVote = errorVote + 1;
					continue loop;
				}
				else {
					candidate[check] = candidate[check]+1;
				}
			}
				System.out.println("Voting results are ");
				for(int i = 0; i<=4 ; i ++) {
					for(int j = 1; j<=4;j++) {
						if(i==1) {
							winner = i;
							looser =i;
						}
					}
				}
}}
}