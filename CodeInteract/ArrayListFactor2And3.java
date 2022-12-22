import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListFactor2And3 {

	public static void main(String[] args) {
		int array[] = { 1, 2, 2, 3, 1, 4, 5, 6, 1, 7, 8, 9 };
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (Integer i : array) {
			if (arrayList.contains(2)) {
				arrayList.remove(2);

			}

		}
		System.out.println(arrayList);
	}

}
