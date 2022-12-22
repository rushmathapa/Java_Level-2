package VotingPackage;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

public class VotingService {

	public Voter voterRegistration(Voter voter) throws IOException, ClassNotFoundException, SQLException {
		VoterDaoInterface dao = new VoterDaoDB();
		dao.voterRegistration(voter);
		System.out.println("Registered Sucesfully!!");

		return voter;
	}

	public void VoterList(Voter voter) throws IOException, ClassNotFoundException, SQLException {
		System.out.println("Registered Voters list is given below ");
		VoterDaoInterface dao = new VoterDaoDB();
		try {
			dao.voterList();
			;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}

	public Voter searchByVoterUserNameAndPassword(String username, String password)
			throws IOException, ClassNotFoundException, SQLException {
		VoterDaoInterface dao = new VoterDaoDB();
		return dao.searchByVoterUserNameAndPassword(username, password);
	}

//*--------------------------------------------------------------------------------------------------------------------------------
	public Candidate candidateRegistration(Candidate candidate)
			throws IOException, ClassNotFoundException, SQLException {
		VoterDaoInterface dao = new VoterDaoDB();
		dao.candidateRegistration(candidate);
		System.out.println("Candidate Registered Sucessfully");
		return candidate;
	}

	public void candidateList(Candidate candidate) throws IOException, ClassNotFoundException, SQLException {
		System.out.println("Registered candidate list is given below ");
		VoterDaoInterface dao = new VoterDaoDB();
		try {
			dao.candidateList();

		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public Candidate searchByCandidateUserNameAndPassword(String username, String password)
			throws IOException, ClassNotFoundException, SQLException {
		VoterDaoInterface dao = new VoterDaoDB();
		return dao.searchByCandidateUserNameAndPassword(username, password);
	}

	// *-----------------------------------------------------------------------------------------------------------------------------------------
	public Voter doVote(int voterid, int candidateid) throws IOException, ClassNotFoundException, SQLException {
		try {
			VoterDaoInterface dao = new VoterDaoDB();
           dao.doVote(voterid,candidateid);
        } catch (SQLIntegrityConstraintViolationException e) {
            e.printStackTrace();
            System.out.println("Faild to registered you already vote");
        }
    
		return null;
	}
	
	//*================================================================================================================
	public void voteCount() throws IOException,ClassNotFoundException, SQLException {
		VoterDaoInterface dao = new VoterDaoDB();
		dao.voteCount();
	}
	
	public Voter searchByUsername(String username) throws IOException, ClassNotFoundException, SQLException {
		VoterDaoInterface dao = new VoterDaoDB();
		dao.searchByUsername(username);
		return null;
	}

	public static boolean checkIfUserNameExists(String username)
			throws IOException, ClassNotFoundException, SQLException {

		VoterDaoInterface dao = new VoterDaoDB();
		Voter voter = null;
		try {
			voter = dao.searchByUsername(username);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Some issue occurred");
			e.printStackTrace();
		}
		if (voter == null) {
			return false;
		} else {
			return true;
		}
	}

}
