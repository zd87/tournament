package tournament;

public class IndividualMatch extends Match {

    private Player playerOne;

    private Player playerTwo;

    public IndividualMatch(Player playerOne, Player playerTwo, int scoreOne,
	    int scoreTwo) {
	super(scoreOne, scoreTwo);
	this.playerOne = playerOne;
	this.playerTwo = playerTwo;
    }

    @Override
    public void showResult() {
	System.out.println(playerOne.getName() + " vs " + playerTwo.getName()
		+ " = " + getScoreOne() + "-" + getScoreTwo());
    }
}
