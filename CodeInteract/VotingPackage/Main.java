package VotingPackage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
			throws InterruptedException, IOException, ClassNotFoundException, SQLException {
		Scanner scan = new Scanner(System.in);
		LogIn log = new LogIn();
		Voter voter = null;
		Candidate candidate = null;
		UserType user = null;
		VotingService vs = new VotingService();

		String[] Heading = { "\n\t" + " Welcome", " to", " Voting", " Management", " System\n\n" };

		for (int i = 0; i < Heading.length; i++) {
			System.out.print(Heading[i]);
			Thread.sleep(500);
		}
		log.getLogIn_v();

		while (true) {

			System.out.println("\t1.Admin\t 2.User");
			System.out.println("Choose the employee type:");
			int userChoice = scan.nextInt();
			if (userChoice == 1) {
				user = UserType.ADMIN;
				System.out.println("1. Voter Register");
				System.out.println("2. view list of voters");
				System.out.println("3. Candiate Registration");
				System.out.println("4. View list of candidates");
				System.out.println("5. SearchByVoterUserNameAndPassword");
				System.out.println("6. searchByCandidateUserNameAndPassword");
				System.out.println("7. Do Vote");
				System.out.println("8. Count Vote");
				System.out.println("9. Exit");

				int choice = 0;
				choice = scan.nextInt();

				if (choice == 1) {
					System.out.println("Enter age");
					int age = scan.nextInt();
					if (age < 18) {
						System.out.println("Not valid age");
					}

					System.out.println("Enter first name:");
					String firstName = scan.next();

					System.out.println("Enter last name:");
					String lastName = scan.next();

					Gender g = null;
					while (true) {
						System.out.println("1.Male\t 2.Female\t 3.Others");
						System.out.println("Choose the gender.");
						int genderChoice = scan.nextInt();
						if (genderChoice == 1) {
							g = Gender.MALE;
						} else if (genderChoice == 2) {
							g = Gender.FEMALE;
						} else if (genderChoice == 3) {
							g = Gender.OTHERS;
						} else {
							System.out.println("Invalid option.");
							continue;
						}
						break;
					}
					String username = null;
					while (true) {
						System.out.println("Enter username::");
						username = scan.next();
						try {
							if (VotingService.checkIfUserNameExists(username)) {
								System.out.println("This username has been taken.");
								continue;
							}
						} catch (IOException e) {
							e.printStackTrace();
						}
						break;
					}

					System.out.println("Enter password::");
					String password = scan.next();

					Voter v = new Voter(age, firstName, lastName, g, username, password);
					try {
						try {
							vs.voterRegistration(v);

						} catch (SQLException e) {
							throw new RuntimeException(e);
						} catch (ClassNotFoundException e) {
							throw new RuntimeException(e);
						}
					} catch (IOException e) {
						System.out.println("Can't register voter. Please try again later.");
						e.printStackTrace();
						continue;
					}
					break;
//*======================================================================
				} else if (choice == 2) {
					try {
						vs.VoterList(voter);
					} catch (IOException e) {
						throw new RuntimeException(e);
					}
//*===================================================================

				} else if (choice == 3) {
					System.out.println("Enter age");
					int age = scan.nextInt();
					if (age < 18) {
						System.out.println("Not valid age");
					}
					System.out.println("Enter first name:");
					String firstName = scan.next();

					System.out.println("Enter last name:");
					String lastName = scan.next();

					Gender g = null;
					while (true) {
						System.out.println("1.Male\t 2.Female\t 3.Others");
						System.out.println("Choose the gender.");
						int genderChoice = scan.nextInt();
						if (genderChoice == 1) {
							g = Gender.MALE;
						} else if (genderChoice == 2) {
							g = Gender.FEMALE;
						} else if (genderChoice == 3) {
							g = Gender.OTHERS;
						} else {
							System.out.println("Invalid option.");
							continue;
						}
						break;
					}
					String username = null;
					while (true) {
						System.out.println("Enter username::");
						username = scan.next();
						try {
							if (VotingService.checkIfUserNameExists(username)) {
								System.out.println("This username has been taken.");
								continue;
							}
						} catch (IOException e) {
							e.printStackTrace();
						}
						break;
					}

					System.out.println("Enter password::");
					String password = scan.next();
					System.out.println("Enter party candidate belongs to::");
					String symbol = scan.next();

					Candidate c = new Candidate(age, firstName, lastName, g, username, password, symbol);
					try {
						try {
							vs.candidateRegistration(c);

						} catch (SQLException e) {
							throw new RuntimeException(e);
						} catch (ClassNotFoundException e) {
							throw new RuntimeException(e);
						}
					} catch (IOException e) {
						System.out.println("Can't register voter. Please try again later.");
						e.printStackTrace();

					}
				}
//*====================================================================================
				else if (choice == 4) {
					try {
						vs.candidateList(candidate);
					} catch (IOException e) {
						throw new RuntimeException(e);
					}
				}
//*==========================================================================================
				else if (choice == 5) {
					System.out.println("Enter username");
					String username = scan.next();
					System.out.println("Enter password");
					String password = scan.next();
					try {
						Voter v = vs.searchByVoterUserNameAndPassword(username, password);
						if (v != null) {
							System.out.println(v.toString());
						} else {
							System.out.println("\n\n\n Employee not present. \n\n\n");

						}
					} catch (IOException e) {
						System.out.println("Failed to get records.");
						e.printStackTrace();
					}
				}
//*==============================================================================================
				else if (choice == 6) {
					System.out.println("Enter username");
					String username = scan.next();
					System.out.println("Enter password");
					String password = scan.next();
					try {
						Candidate candidate1 = vs.searchByCandidateUserNameAndPassword(username, password);
						if (candidate1 != null) {
							System.out.println(candidate1.toString());
						} else {
							System.out.println("\n\n\n Employee not present. \n\n\n");

						}
					} catch (IOException e) {
						System.out.println("Failed to get records.");
						e.printStackTrace();
					}
				}
//*==================================================================================================================				
				else if (choice == 7) {
					System.out.println("Enter Voter id to vote");
					int voterid = scan.nextInt();
					System.out.println("Enter candidate id to vote");
					int candidateid = scan.nextInt();

					vs.doVote(voterid, candidateid);
				}
//*================================================================================================
				else if (choice == 8) {
					try {
						vs.voteCount();
					} catch (IOException e) {
						throw new RuntimeException(e);
					}

				}
				// *====================================================
				else if (choice == 9) {
					System.out.println("Logged out successfully!");
					break;
				} else {
					System.out.println("Invalid Choice.");
				}
			}

			else if (userChoice == 2) {
				user = UserType.USER;

				System.out.println();
			} else {
				System.out.println("Invalid option.");
				continue;
			}
			break;
		}

	}

}
