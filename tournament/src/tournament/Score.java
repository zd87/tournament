package tournament;

public class Score {

    private int scoreOne;

    private int scoreTwo;

    public Score(int scoreOne, int scoreTwo) {
	this.scoreOne = scoreOne;
	this.scoreTwo = scoreTwo;
    }

    public int getScoreOne() {
	return scoreOne;
    }

    public void setScoreOne(int scoreOne) {
	this.scoreOne = scoreOne;
    }

    public int getScoreTwo() {
	return scoreTwo;
    }

    public void setScoreTwo(int scoreTwo) {
	this.scoreTwo = scoreTwo;
    }

    @Override
    public String toString() {
	return scoreOne + "-" + scoreTwo;
    }
}
