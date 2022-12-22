package ResturantMgmtSystem;

public class Salary {
private double hoursWorked;
private double hourlyRate;
private double basicPay;
private double overTime;
private double overtimePayRate;
private double overTimePay;
private double grossSalary;

public Salary(double hoursWorked,double hourlyRate,double basicPay, double overTime,double overtimePayRate,
				double overTimePay, double grossSalary	) {
	this.hoursWorked = hoursWorked;
	this.hourlyRate = hourlyRate;
	this.basicPay = basicPay;
	this.overTime = overTime;
	this.overtimePayRate = overtimePayRate;
	this.grossSalary = grossSalary;
}

public double getHoursWorked() {
	return hoursWorked;
}

public void setHoursWorked(double hoursWorked) {
	this.hoursWorked = hoursWorked;
}

public double getHourlyRate() {
	return hourlyRate;
}

public void setHourlyRate(double hourlyRate) {
	this.hourlyRate = hourlyRate;
}

public double getBasicPay() {
	return basicPay;
}

public void setBasicPay(double basicPay) {
	if(hoursWorked<=40) {
		basicPay = hoursWorked * hourlyRate;
	}
	
}

public double getOverTime() {
	return overTime;
}

public void setOverTime(double overTime) {
	overTime = hoursWorked - 40;
}

public double getOvertimePayRate() {
	return overtimePayRate;
}

public void setOvertimePayRate(double overtimePayRate) {
	this.overtimePayRate = overtimePayRate;
}

public double getOverTimePay() {
	return overTimePay;
}

public void setOverTimePay(double overTimePay) {
	overTimePay = (40 * basicPay) + (overTime * overtimePayRate);
}

public double getGrossSalary() {
	return grossSalary;
}

public void setGrossSalary(double grossSalary) {
	grossSalary = basicPay + overTimePay;
}



}
