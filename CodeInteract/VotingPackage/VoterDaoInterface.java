package VotingPackage;

import java.io.IOException;
import java.sql.SQLException;

public interface VoterDaoInterface {
	
	public Voter voterList()throws IOException, ClassNotFoundException, SQLException ;
	public Voter voterRegistration(Voter voter) throws IOException, ClassNotFoundException, SQLException;
	public Voter searchByVoterUserNameAndPassword(String username, String password)throws IOException, ClassNotFoundException, SQLException ;
	public Candidate candidateRegistration(Candidate candidate)throws IOException, ClassNotFoundException, SQLException ;
	public Candidate candidateList()throws IOException, ClassNotFoundException, SQLException ;
	public Candidate searchByCandidateUserNameAndPassword(String username, String password);
	public Voter doVote(int voterid, int candidateid) throws IOException, ClassNotFoundException, SQLException ;
	public void voteCount() throws IOException,ClassNotFoundException, SQLException;
	public Voter searchByUsername(String username)throws IOException, ClassNotFoundException, SQLException ;
	
	


}
