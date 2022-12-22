package VotingPackage;

public class Candidate {
	private int candidateid;
	private int age;
	private String fname;
	private String lname;
	protected Gender gender;

	private String userName;
	private String password;
	private String symbol;

	public Candidate() {

	}

	public Candidate(int candidateid, int age, String firstName, String lastName, Gender g, String username, String password,
			String symbol) {
		this.candidateid = candidateid;
		this.age = age;
		this.fname = firstName;
		this.lname = lastName;
		this.gender = g;
		this.userName = username;
		this.password = password;
		this.symbol = symbol;

	}
	public Candidate(int age, String firstName, String lastName, Gender g, String username, String password,
			String symbol) {
		this.age = age;
		this.fname = firstName;
		this.lname = lastName;
		this.gender = g;
		this.userName = username;
		this.password = password;
		this.symbol = symbol;
	}

	public int getCandidateid() {
		return candidateid;
	}

	public void setCandidateid(int candidateid) {
		this.candidateid = candidateid;
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

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
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

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	@Override
	public String toString() {
		return "Candidate [candidateid=" + candidateid + ", age=" + age + ", fname=" + fname + ", lname=" + lname
				+ ", gender=" + gender + ", userName=" + userName + ", password=" + password + ", symbol=" + symbol
				+ "]";
	}



}
