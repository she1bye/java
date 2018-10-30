package zut.edu.cs.network.experiment6;

public class Candidate {
	private String name;
	private Vote vote;
	private int numberOfCandidates;
	
	public void setNumberOfCandidates(int numberOfCandidates) {
		this.numberOfCandidates = numberOfCandidates;
	}

	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Candidate(String name, Vote vote) {
		super();
		this.name = name;
		this.vote = vote;
	}

	public String getName() {
		return name;
	}

	public Vote getVote() {
		return vote;
	}

	public int getNumberOfCandidates() {
		
		return numberOfCandidates;
	}	
}
