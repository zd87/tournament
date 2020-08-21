package tournament;

public class IndividualMatch extends Match {

    private Player playerOne;

    private Player playerTwo;

    public IndividualMatch(Player playerOne, Player playerTwo) {
	super();
	this.playerOne = playerOne;
	this.playerTwo = playerTwo;
    }

    @Override
    public void showResult() {
	System.out.println(
		playerOne.getName() + " vs " + playerTwo.getName() + ":");
	System.out.println("* Half time score: " + getHalfTimeScore());
	System.out.println("* Final score: " + getFinalScore());
    }
}
