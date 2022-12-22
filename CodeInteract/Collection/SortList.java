package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortList implements Comparable<SortList>{
	private Integer rollNo;
	private String name;
	
	public SortList(String name,Integer rollNo ) {
		this.rollNo = rollNo;
		this.name = name;
	}
	@Override
	public int compareTo(SortList o) {
		if(this.rollNo == o.rollNo) {
			return 0;
		}
			else if(this.rollNo > o.rollNo) {
				return -1;
			}
			else {
				return 1;
		}
	}
	
public static void main(String[] args) {
	
		ArrayList<SortList> students = new ArrayList<>();
		students.add(new SortList ("ram" , 2));
		students.add(new SortList ("Shayma" ,3));
		students.add(new SortList("ram", 4));
		
		Collections.sort(students);
		System.out.println(students);
		
	}
@Override
public String toString() {
	return "SortList [rollNo=" + rollNo + ", name=" + name + "]";
}

	
		
	

}
