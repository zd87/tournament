package tournament;

public class CollectiveMatch extends Match {

    private Team teamOne;

    private Team teamTwo;

    public CollectiveMatch(Team teamOne, Team teamTwo, int scoreOne,
	    int scoreTwo) {
	super(scoreOne, scoreTwo);
	this.teamOne = teamOne;
	this.teamTwo = teamTwo;
    }

    @Override
    public void showResult() {
	System.out.println(teamOne.getName() + " ("
		+ teamOne.getPlayers().size() + ") " + " vs "
		+ teamTwo.getName() + " (" + teamTwo.getPlayers().size() + ") "
		+ " = " + getScoreOne() + "-" + getScoreTwo());
    }
}
