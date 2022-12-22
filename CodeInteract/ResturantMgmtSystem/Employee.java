package ResturantMgmtSystem;

import java.time.LocalDateTime;

public class Employee {
	private int id;
	private String name;
	private int age;
	private int login;
	private LocalDateTime clockIn;
	private LocalDateTime clockOut;
	
	public Employee(int id, String name, int age,int login, LocalDateTime clockIn,LocalDateTime clockOut) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.login = login;
		this.clockIn = clockIn;
		this.clockOut = clockOut;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getLogin() {
		return login;
	}

	public void setLogin(int login) {
		this.login = login;
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
	
	
	
	
	
	
	
	

}
