package EmployementManagementSystem.copy;

import java.time.Duration;
import java.time.LocalDateTime;

public class EmployeeInfo {
	private int id;
	private String fname;
	private String lname;
	private String contact;
	private LocalDateTime clockIn;
	private LocalDateTime clockOut;
	private double totalHours;
	EmployeeInfo(){
		
	}
	
	EmployeeInfo(int id, String fname, String lname) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
	}
	// constructor
	public EmployeeInfo(int id, String fname, String lname, String contact, LocalDateTime clockIn,
			LocalDateTime clockOut, double totalHours) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.contact = contact;
		this.clockIn = clockIn;
		this.clockOut = clockOut;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public LocalDateTime getClockIn() {
		return clockIn;
	}

	public void setClockIn(LocalDateTime clockIn) {
		this.clockIn = clockIn;
	}

	public LocalDateTime getClockOut() {
		return clockOut;
	}

	public void setClockOut(LocalDateTime clockOut) {
		this.clockOut = clockOut;
	}

	public double getTotalHours() {
		return totalHours;
	}

	public void setTotalHours() {
		totalHours = Duration.between(clockIn, clockOut).toHours();
	}

	public void display() {
		
		System.out.println(getId());
		System.out.println(getFname());
		System.out.println(getLname());
		

	}
}