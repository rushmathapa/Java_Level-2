import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortKeys {
 //unsorted values 
	static Map<Integer, String> map = new HashMap<>();	
	//to sort map by key 
	public static void sortMapByKey() {
		List<Integer> sortKeys = new ArrayList<Integer>(map.keySet());
		Collections.sort(sortKeys);
		
		//getting value for each key and displaying results
		for(Integer x : sortKeys) {
			System.out.println("Key = " + x);
			System.out.println("Value = " + map.get(x));
		}
	}
	public static void main(String[] args) {
		map.put(1, "Sita");
		map.put(2, "Ram");
		map.put(3, "Hari");
		map.put(4, "Sita");
		sortMapByKey();
	}

}

//create table Person( id int not null,
//        email varchar(30) not null);
//
//insert into Person values(1,'a@b.com');
//insert into Person values(2,'c@d.com');
//insert into Person values(3,'a@b.com');
//
//select * from Person;

//SQL 
//SELECT <columns>email
//FROM <table>person
//GROUP BY <columns>email
//HAVING COUNT(*) > 1;
