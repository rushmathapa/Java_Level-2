package VotingPackage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class VoterDaoDB implements VoterDaoInterface {
	private final static String USERNAME = "root";

	private final static String PASSWORD = "Gomaradha2!";

	private final static String URL = "jdbc:mysql://localhost:3306/election?useSSL=false&allowPublicKeyRetrieval=true"
			+ "";

	public Voter voterRegistration(Voter voter) throws IOException, ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

		String insertQuery = "INSERT INTO voters (voter_age, voter_fname,voter_lname,voter_gender,voter_username,voter_password)"
				+ "value ( '" + voter.getAge() + "' , '" + voter.getFname() + "', '" + voter.getLname() + "','"
				+ voter.getGender() + "'," + "'" + voter.getUserName() + "','" + voter.getPassword() + "')";

		System.out.println(insertQuery);

		Statement statement = con.createStatement();
		int resultValue = statement.executeUpdate(insertQuery);

		if (resultValue == 2) {
			System.out.println("Failed to insert/update data. Check your data and try again.");
		}

		statement.close();
		con.close();

		return voter;

	}

	@Override
	public Voter voterList() {
		Voter voter = new Voter();
		Connection con = null;
		Statement statement = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			String query = "SELECT * from voters";

			// System.out.println(query);

			statement = con.createStatement();

			ResultSet results = statement.executeQuery(query);

			while (results.next()) {
				voter = new Voter();
				voter.setVoterID(results.getInt(1));
				voter.setAge(results.getInt(2));
				voter.setFname(results.getString(3));
				voter.setLname(results.getString(4));
				voter.setGender(Gender.getByValue(results.getString(5)));
				voter.setUserName(results.getString(6));
				voter.setPassword(results.getString(7));

				System.out.println(voter);

			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return voter;
	}

	@Override
	public Voter searchByVoterUserNameAndPassword(String username, String password) {
		Connection con = null;
		Statement statement = null;
		Voter voter = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			String query = "select * from election.voters where username ='" + username + "' and password='" + password
					+ "'";
			System.out.println(query);

			statement = con.createStatement();
			ResultSet results = statement.executeQuery(query);

			while (results.next()) {

				voter = new Voter();
				voter.setVoterID(results.getInt(1));
				voter.setAge(results.getInt(2));
				voter.setFname(results.getString(3));
				voter.setLname(results.getString(4));
				voter.setGender(Gender.getByValue(results.getString(5)));
				voter.setUserName(results.getString(6));
				voter.setPassword(results.getString(7));
				System.out.println(voter);

			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return voter;

	}

	// *----------------------------------------------------------------------------------------------------------

	@Override
	public Candidate candidateRegistration(Candidate candidate)
			throws IOException, ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

		String insertQuery = "INSERT INTO candidate (candidate_age, candidate_fname,candidate_lname,candidate_gender,candidate_username,candidate_password,party_symbol)"
				+ "value ( '" + candidate.getAge() + "' , '" + candidate.getFname() + "', '" + candidate.getLname()
				+ "','" + candidate.getGender() + "'," + "'" + candidate.getUserName() + "','" + candidate.getPassword()
				+ "','" + candidate.getSymbol() + "')";

		System.out.println(insertQuery);

		Statement statement = con.createStatement();
		int resultValue = statement.executeUpdate(insertQuery);

		if (resultValue == 2) {
			System.out.println("Failed to insert/update data. Check your data and try again.");
		}

		statement.close();
		con.close();

		return candidate;

	}

	@Override
	public Candidate candidateList() {
		Candidate candidate = new Candidate();
		Connection con = null;
		Statement statement = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			String query = "SELECT * from voters";

			// System.out.println(query);

			statement = con.createStatement();

			ResultSet results = statement.executeQuery(query);

			while (results.next()) {
				candidate = new Candidate();
				candidate.setCandidateid(results.getInt(1));
				candidate.setAge(results.getInt(2));
				candidate.setFname(results.getString(3));
				candidate.setLname(results.getString(4));
				candidate.setGender(Gender.getByValue(results.getString(5)));
				candidate.setUserName(results.getString(6));
				candidate.setPassword(results.getString(7));
				candidate.setSymbol(results.getString(8));

			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return candidate;
	}

	@Override
	public Candidate searchByCandidateUserNameAndPassword(String username, String password) {
		Connection con = null;
		Statement statement = null;
		Candidate candidate = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			String query = "select * from election.candidate where username ='" + username + "' and password='"
					+ password + "'";
			System.out.println(query);

			statement = con.createStatement();
			ResultSet results = statement.executeQuery(query);

			while (results.next()) {

				candidate = new Candidate();
				candidate.setCandidateid(results.getInt(1));
				candidate.setAge(results.getInt(2));
				candidate.setFname(results.getString(3));
				candidate.setLname(results.getString(4));
				candidate.setGender(Gender.getByValue(results.getString(5)));
				candidate.setUserName(results.getString(6));
				candidate.setPassword(results.getString(7));
				System.out.println(candidate);

			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return candidate;

	}

	// *=================================================================

	public Voter doVote() throws IOException, ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Voter voter = null;
		Candidate candidate = null;

		Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

		@SuppressWarnings("null")
		String insertQuery = "INSERT INTO votes (voter_id,candidate_id)" + "value (" + voter.getVoterID() + ','
				+ candidate.getCandidateid() + ")";

		System.out.println(insertQuery);

		Statement statement = con.createStatement();
		int resultValue = statement.executeUpdate(insertQuery);

		if (resultValue == 2) {
			System.out.println("You already voted");
		}

		statement.close();
		con.close();
		return null;

	}

//*===========================================================================================================
	public void voteCount() throws IOException, ClassNotFoundException, SQLException {

		Connection con = null;
		Statement statement = null;
		Voter voter = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			String query = "select count(*)from election.votes where candidate_id in (select symbol from election.candidate where symbol = republic"
					+ "'";
			System.out.println(query);

			statement = con.createStatement();
			ResultSet results = statement.executeQuery(query);

			int vote = 0;
			if (results.next()) {
				vote = results.getInt(vote);
				vote++;

			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

// *===================================================================================================
	@Override
	public Voter searchByUsername(String username) {
		return null;
	}

}
