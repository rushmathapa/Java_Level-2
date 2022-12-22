import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateInList {

	public static void main(String[] args) {
		String[] name = { "ram", "Shyam", "sita" };
		List<String> list = Arrays.asList(name);
		System.out.println(list);

		
		Set<String> set = new HashSet<String>();
		set.addAll(list);
		System.out.println(set);
		
		List<String> filterList = new ArrayList <String>(set);
		System.out.println(filterList);
		
	}

}
