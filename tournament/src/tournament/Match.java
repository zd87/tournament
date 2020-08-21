package tournament;

public abstract class Match {

    private int scoreOne;

    private int scoreTwo;

    public Match(int scoreOne, int scoreTwo) {
	this.scoreOne = scoreOne;
	this.scoreTwo = scoreTwo;
    }

    public int getScoreOne() {
	return scoreOne;
    }

    public int getScoreTwo() {
	return scoreTwo;
    }

    public abstract void showResult();
}
