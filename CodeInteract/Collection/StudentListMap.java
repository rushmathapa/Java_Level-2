package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//2. Write a program to store convert the array list created in class, to hashmap. Add a new integer value to use as a key, and store student as value
public class StudentListMap {
	

	public static void main(String[] args) {
		List<String> student =  new ArrayList<>();
		student.add("john");
		student.add("syam");
		student.add("jane");
		
		Map<Integer, String> map = new HashMap<>();
		int key = 1;
		for(String s : student) {
			map.put(key, s);
			key ++;
			}
		System.out.println(map);
		
		
	}

}
