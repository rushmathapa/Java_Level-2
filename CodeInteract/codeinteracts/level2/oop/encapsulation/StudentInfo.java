package codeinteracts.level2.oop.encapsulation;

public class StudentInfo {// class
	private int id;
	String firstName; // property
	String lastName;
	int age;
	String gender;
	private String contactNumber;
	private String address;

	public void printname() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

	public static void main(String[] args) {
		StudentInfo student1 = new StudentInfo ();
		student1.id = 2;
		student1.firstName = "john";
		student1.lastName = "smith";
		student1.age = 30;
		student1.gender = "m";
		student1.contactNumber = "5105791198";
		student1.address = "805";

	}

}
