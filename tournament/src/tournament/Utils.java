package tournament;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static int randomScore(int min) {
	// random number from minimum to 3
	int result = min + (int) (Math.random() * (3 - min) + 1);
	return result;
    }

    // generating random names for teams
    public static List<String> randomNames(int number) {
	List<String> result = new ArrayList<>();
	for (int i = 0; i < number; i++) {
	    result.add("Name" + (i + 1));
	}
	return result;
    }

    // setting half time score
    public static void setHalfTimeScore(List<Match> matches) {
	for (Match match : matches) {
	    Score helfTimeScore = match.getHalfTimeScore();
	    helfTimeScore.setScoreOne(randomScore(0));
	    helfTimeScore.setScoreTwo(randomScore(0));
	    match.setHalfTimeScore(helfTimeScore);
	}
    }

    // setting final score
    public static void setFinalScore(List<Match> matches) {
	for (Match match : matches) {
	    Score halfTimeScore = match.getHalfTimeScore();
	    Score finalScore = match.getFinalScore();
	    finalScore.setScoreOne(randomScore(halfTimeScore.getScoreOne()));
	    finalScore.setScoreTwo(randomScore(halfTimeScore.getScoreTwo()));
	    match.setFinalScore(finalScore);
	}
    }
}
