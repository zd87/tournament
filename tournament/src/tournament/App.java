package tournament;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
	// create individual matches
	IndividualMatch indMatchOne = new IndividualMatch(
		new Player("Superman"), new Player("Batman"), randomScore(),
		randomScore());
	IndividualMatch indMatchTwo = new IndividualMatch(
		new Player("Iron man"), new Player("Antman"), randomScore(),
		randomScore());
	// create teams
	Team teamOne = new Team("The X-men", randomNames(11));
	Team teamTwo = new Team("Avengers", randomNames(11));
	Team teamThree = new Team("Freaks", randomNames(11));
	Team teamFour = new Team("Geeks", randomNames(11));
	// create collective matches
	CollectiveMatch collMatchOne = new CollectiveMatch(teamOne, teamTwo,
		randomScore(), randomScore());
	CollectiveMatch collMatchTwo = new CollectiveMatch(teamThree, teamFour,
		randomScore(), randomScore());
	// create list of matches
	List<Match> tournament = new ArrayList<>();
	tournament.add(indMatchOne);
	tournament.add(indMatchTwo);
	tournament.add(collMatchOne);
	tournament.add(collMatchTwo);
	// printing scores
	for (Match match : tournament) {
	    match.showResult();
	}
    }

    public static int randomScore() {
	// random number from 0 to 3
	return (int) (Math.random() * 4);
    }

    public static List<String> randomNames(int number) {
	List<String> result = new ArrayList<>();
	for (int i = 0; i < number; i++) {
	    result.add("Name" + (i + 1));
	}
	return result;
    }
}
