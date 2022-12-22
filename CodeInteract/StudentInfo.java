
public class StudentInfo {
	StudentInfo(){
		
	}
	int id;
	String firstName;
	String lastName;
	int age;
	String gender;
	String grade;
	
	public StudentInfo(int id, int age,String firstName,String lastName, String gender,String grade ) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.grade = grade;
	}
	
	public static void main(String[] args) {
		StudentInfo student = new StudentInfo();
		student.id = 12;
		student.firstName = "Sandy";
		student.lastName = "Thapa";
		student.age = 30;
		student.gender = "male";
		student.grade = "computer science";
		
		System.out.println(student.id);
		System.out.println(student.firstName);
		System.out.println(student.lastName);
		System.out.println(student.age);
		System.out.println(student.gender);
		System.out.println(student.grade);
	}

}
