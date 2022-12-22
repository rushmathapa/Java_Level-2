package EmployementManagementSystem.copy;

public class Salary {
	private String position;

	private double payRate;

	private double basicPay;

	private double overTime;

	private double overTimePayRate;

	private double netPay;

	EmployeeInfo employee;
	
	
	public EmployeeInfo getemployee()
	{
		return this.employee;
	}
	public void setemployee(EmployeeInfo employee)
	{
		this.employee=employee;
	}

	public Salary(double hoursWorked, String position, double payRate, double basicPay, double overTime,

	double overTimePayRate, double netPay) {

	this.position = position;

	this.payRate = payRate;

	this.basicPay = basicPay;

	this.overTime = overTime;

	this.overTimePayRate = overTimePayRate;

	this.netPay = netPay;

	this.position = position;

	}

	public String getPosition() {

	return position;

	}

	public void setPosition(int position) {

	if (position == 1) {

	this.setPosition(position);

	} else if (position == 2) {

	this.setPosition(position);

	} else if (position == 3) {

	this.setPosition(position);

	} else {

	System.out.println("Invalid input");

	}

	}

	public double getPayRate() {

	return payRate;

	}

	public void setPayRate(int position) {

	if (position == 1) {

	payRate = 85;

	} else if (position == 2) {

	payRate = 70;

	} else {

	payRate = 60;

	}

	}

	public double getBasicPay() {

	return basicPay;

	}

	public void setBasicPay(double basicPay) {

	basicPay = employee.getTotalHours() * payRate;

	}

	public double getOverTime() {

	return overTime;

	}

	public void setOverTime(double overTime) {

	if (overTime <= 40) {

	overTime = employee.getTotalHours();

	} else {

	overTime = employee.getTotalHours() - 40;

	}

	}

	public double getOverTimePayRate() {

	return overTimePayRate;

	}

	public void setOverTimePayRate(double overTimePayRate) {

	this.overTimePayRate = overTimePayRate;

	}

	public double getnetPay() {

	return netPay;

	}

	public void setGrossPay(double grossPay) {

	netPay = basicPay + (overTime * overTimePayRate);

	}
			
}


