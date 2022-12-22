package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Write a program to store convert the array list created in class, to hashmap. Add a new integer value to use as a key, and store student as value
public class StudentHashMap {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("ram");
		list.add("Shyam");
		list.add("Krish");
		list.add("adam");
		
		Map<Integer, String> map = new HashMap<>();
		int key = 1;
		for(String s : list) {
			map.put(key, s);
			key ++;
		}
		System.out.println(map);
	}

}
