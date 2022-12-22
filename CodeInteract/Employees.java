
public class Employees {
	private Integer id;
	private String firstName;
	private String lastName;
	private Gender gender;
	private String username;
	private String password;
	private EmployeeType employeeType;
	private Employees() {
		super();
	}
	public void Employee(Integer id, String firstName, String lastName, Gender gender, String username, String password,
		    EmployeeType employeeType) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.username = username;
		this.password = password;
		this.employeeType = employeeType;
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String userName) {
		this.username = userName;
	}

	public String getPassWord() {
		return password;
	}

	public void setPassWord(String passWord) {
		this.password = passWord;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
		        + ", username=" + username + ", employeeType=" + employeeType + "]";
	}

	
	
	
	

}
