import java.util.ArrayList;

public class DuplicateNumbers {

	public static void main(String[] args) {
		ArrayList<Integer>numbers = new ArrayList<>();	
		int array[] = { 1, 2, 2, 3, 1,5,8, 4, 5, 6, 1, 7, 8, 9 };
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (Integer i : array) {
			if (!arrayList.contains(i)) {
				arrayList.add(i);

			}

		}
		System.out.println(arrayList);	
	
	}

}
