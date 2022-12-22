import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentInArrayList implements Comparable<StudentInArrayList> {
	Integer id;
	String name;
	Integer age;

	public StudentInArrayList(Integer id, String name, Integer age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(StudentInArrayList o) {
		if (this.age == o.age) {
			return 0;
		} else if (this.age > o.age) {
			return -1;
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		StudentInArrayList lis = new StudentInArrayList(25, "ram", 35);
		ArrayList<StudentInArrayList> students = new ArrayList<>();
		students.add(lis);
		StudentInArrayList lis1 = new StudentInArrayList(2, "sita", 45);
		students.add(lis1);
		students.add(new StudentInArrayList(1, "ham", 15));
		students.add(new StudentInArrayList(3, "ram", 35));
		students.add(new StudentInArrayList(2, "ram", 35));
		Collections.sort(students);
		System.out.println(students);
		
		
		List<StudentInArrayList> agesum = new ArrayList<>();
		for(int i = 0; i < students.size(); i++) {
			StudentInArrayList num = students.get(i);
			int sum =num.age + 10;
			 System.out.println(agesum);
		}

		List<StudentInArrayList> filter = new ArrayList<>();
		for (int i = 0; i < students.size(); i++) {
			StudentInArrayList val = students.get(i);
			if (val.age >= 10 && val.age <= 40) {
				filter.add(val);
			}
			
		}
System.out.println(filter);
	}

	@Override
	public String toString() {
		return "StudentInArrayList [id=" + id + ", name=" + name + ", age=" + age + "]";

	}

}
