package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortAgeHashMap implements Comparable<SortAgeHashMap> {

	String name;
	int age;

	public SortAgeHashMap(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {

	}

	static Map<Integer, String> map = new HashMap<>();

	public SortAgeHashMap() {
		List<Integer> sortAgeHashMap = new ArrayList<Integer>(map.keySet());
		Collections.sort(sortAgeHashMap);
		
		map.put(10, "john");
		map.put(45, "hary");
		map.put(5, "syam");


		for (Integer x : sortAgeHashMap) {
			System.out.println("age = " + x);
			System.out.println("Value = " + map.get(x));
		}

	}

	@Override
	public int compareTo(SortAgeHashMap o) {
		if (this.age == age) {
			return 0;
		} else if (this.age > age) {
			return -1;

		} else {
			return 1;
		}
	}

}