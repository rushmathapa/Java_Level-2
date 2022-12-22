package VoteProjectJavaClass;

import java.time.LocalDate;

public class VoterDetails {
	private Integer id;
	private String firstName;
	private String lastName;
	private Gender gender;
	private LocalDate dob;
	private String username;
	private String password;
	
	// constrictor for the objects to pass the values on it
	public VoterDetails(Integer id, String firstName, String lastName, Gender gender,LocalDate dob, String username, String password) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dob = dob;
		this.username = username;
		this.password = password;		//pointed parameter value to class object
	}
	//create getter and setter since the accesmodifier is private.

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

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
