import java.util.Scanner;

public class Employee {
	private  String firstName;
	private String lastName;
	private String employeeid;
	private float hourlypay;
	private float workedhours;

	public Employee(String firstName, String lastName, String employeeID, float hourlypay, float workedhours) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeid = employeeID;
		this.hourlypay = hourlypay;
		this.workedhours = workedhours;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}

	public float getHourlypay() {
		return hourlypay;
	}

	public void setHourlypay(float hourlypay) {
		this.hourlypay = hourlypay;
	}

	public float getWorkedhours() {
		return workedhours;
	}

	public void setWorkedhours(int workedhours) {
		this.workedhours = workedhours;
	}

	public float paycheck() {
		return hourlypay * workedhours;
	}

	public static void main(String[] args) {
		System.out.println("...Employee Management System..");
		System.out.println("1. Add Employee");
		System.out.println("2. Login");
		System.out.println("3. Get Paycheck");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter choice");
		int choice = scan.nextInt();
		switch (choice) {
		case 1: {
				System.out.println("Enter total number of Employee ");
				int totalemp = scan.nextInt();
				int[] emparray = new int[totalemp];
				for(int i = 0; i <emparray.length; i ++) {
					System.out.println("Enter first name of employee");
					System.out.println("Enter last name");
					String lastname = scan.nextLine();
					}
		}
		}

		Employee emp1 = new Employee("John", "smith", "212", 17.50f, 40f);
		Employee emp2 = new Employee("Riyad", "chon", "223", 25.50f, 40.05f);
		System.out.println("Total Pay:" + emp1.paycheck());
		System.out.println("Total Pay:" + emp2.paycheck());
	}

}
