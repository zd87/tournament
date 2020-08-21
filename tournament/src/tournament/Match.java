package tournament;

public abstract class Match {

    private Score halfTimeScore;

    private Score finalScore;

    public Match() {
	// score by default 0
	this.halfTimeScore = new Score(0, 0);
	this.finalScore = new Score(0, 0);
    }

    public Score getHalfTimeScore() {
	return halfTimeScore;
    }

    public void setHalfTimeScore(Score halfTimeScore) {
	this.halfTimeScore = halfTimeScore;
    }

    public Score getFinalScore() {
	return finalScore;
    }

    public void setFinalScore(Score finalScore) {
	this.finalScore = finalScore;
    }

    public abstract void showResult();
}
