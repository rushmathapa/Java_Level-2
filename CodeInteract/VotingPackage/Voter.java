package VotingPackage;

import java.util.Objects;

public class Voter {
	private int voterid;
	private int age;
	private String fname;
	private String lname;
	protected Gender gender;

	private String userName;
	private String password;

	private UserType userType;
	

	public Voter() {

	}

	public Voter(int age, String fname, String lname, Gender gender, String userName, String password) {
		super();
		this.age = age;
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.userName = userName;
		this.password = password;
	}

	public Voter(int voterid, int age, String fname, String lname, Gender gender, String userName, String password,
			UserType userType) {

		this.voterid = voterid;
		this.age = age;
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.userName = userName;
		this.password = password;
		this.userType = userType;

	}

	public int getVoterID() {
		return voterid;
	}

	public void setVoterID(int voterID) {
		this.voterid = voterID;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, fname, gender, lname, password, userName, userType);
	}

	@Override
	public String toString() {
		return "Voter [voterid=" + voterid + ", age=" + age + ", fname=" + fname + ", lname=" + lname + ", gender="
				+ gender + ", userName=" + userName + ", password=" + password + ", userType=" + userType + "]";
	}

}
