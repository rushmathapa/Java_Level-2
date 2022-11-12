package EmployementManagementSystem.copy;

import java.util.Scanner;

public class Main {

	static EmployeeInfo[] employees = new EmployeeInfo[10];
	static Salary[] listSalary = new Salary[10];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean temp = true;
		int arrIndex = 0;
		int arrIndexofSalary = 0;
		boolean logedIn = false;
		
		while(temp) {
			
			System.out.println("....Employee Management System.....");
			System.out.println("1. Add Employee");
			System.out.println("2. Login");
			System.out.println("3. logout");
			System.out.println("4. Get PayCheck");
			System.out.println("5. Exit");

			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				EmployeeInfo emp = new EmployeeInfo();
				System.out.println("Enter Employee ID");
				int iD = scan.nextInt();
				scan.nextLine();
				
				System.out.println("Enter Employee First name");
				String fName = scan.next();
				emp.setFname(fName);

				System.out.println("Enter Employee Last name");
				String lName = scan.next();
				emp.setLname(lName);

				employees[arrIndex] = emp;
				arrIndex++; // increasing employee array index
				employees[0].display();
				System.out.println(temp);
				break;

			case 2:
				LogInOut log = new LogInOut();
				logedIn = log.getLogIn();
				break;
				
			case 3: 
				logedIn = false;
				break;
				
			case 4:
				if(logedIn)
					scan.nextLine();
				System.out.println("Enter the Employee first name to create paycheck.");
				String name = scan.nextLine();
				EmployeeInfo employeeInfo1 = null;
				for(int i = 0; i < arrIndex; i++) {
					try {
						EmployeeInfo employeeInfo = employees[i];
						if(employeeInfo.getFname().equals(name)) {
							employeeInfo1 = employeeInfo;
						}
						
					}
					catch(Exception e) {
						System.out.println("Please add employee first");
						
					}
				}
				if(employeeInfo1!=null) {
					int flag = 0;
					for(int i = 0 ; i<arrIndexofSalary; i++) {
						if(listSalary[i].getemployee().getFname().equals(name)) {
							System.out.println("Net pay of this Employee is:" + listSalary[i].getnetPay());
							flag = 1;
							break;
						}
					}
					if(flag == 0) {
						System.out.println("Enter the position");
						String position = scan.nextLine();
						System.out.println("Please enter the payRate");
						double payRate=scan.nextDouble();
						
						System.out.println("Please enter the basicPay");
						double basicPay=scan.nextDouble();
						
						System.out.println("Please enter the overTime");
						double overTime=scan.nextDouble();
						
						System.out.println("Please enter the overTimePayRate");
						double overTimePayRate=scan.nextDouble();
						
						System.out.println("Please enter the netPay");
						double netPay=scan.nextDouble();
						Salary salary=new Salary(position, payRate, basicPay, overTime, overTimePayRate, netPay);
						salary.setemployee(employeeInfo1);
						listSalary[arrIndexofSalary]=salary;
						arrIndexofSalary++;
						System.out.println("Salary added");
						}
					}
					else
					{
						System.out.println("Please enter the valid Employee name or add the employee first");
					
					}
					
				break;
			case 5:

				temp=false;

				System.out.println("Thanks for using this program");

				break;

				}
				}

				
	}
}
