import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Write a program to add roll number and name in hashmap, and search a student by name.
//use integer as key and string as value. and search student name in value
public class NameRollNoHashMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1,"Ram");
		map.put(2,"Sita");
		map.put(3, "gita");
		
		System.out.println(map);
		
		Set<Integer> key = map.keySet();
		
	//Looping in key of map
		for(Integer Key : map.keySet()) {
			System.out.println("Key:" +key);
			
		}
		
		for(String value: map.values()) {
			System.out.println(value);
			
		}
		
		for(Map.Entry<Integer, String> val: map.entrySet()) {
			System.out.println(val.getKey());
			System.out.println(val.getValue());
		}
		Map<Integer,String>map1 = new HashMap<Integer, String>();
		map1.put(4, "Hari");
		map1.put(5, "Rita");
		
		map.putAll(map1);
		System.out.println(map);
		
		map.putIfAbsent(5, "Shyam");
		System.out.println(map);
		
		map.replace(5, "rita");
		System.out.println(map);
		
		map.remove(5);
		System.out.println(map);
		System.out.println(map.isEmpty());
		
		for(Entry<Integer, String> keyval: map.entrySet()) {
			if(keyval.getValue().equals("Geeta")) {
				System.out.println("key ::" +keyval.getKey());
			}
			
		}
		map.put(null, null);
		System.out.println(map);
	}

}
