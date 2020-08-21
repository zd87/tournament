package tournament;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
	// create individual matches
	IndividualMatch indMatchOne = new IndividualMatch(
		new Player("Superman"), new Player("Batman"));
	IndividualMatch indMatchTwo = new IndividualMatch(
		new Player("Iron man"), new Player("Antman"));
	// create teams
	Team teamOne = new Team("The X-men", Utils.randomNames(11));
	Team teamTwo = new Team("Avengers", Utils.randomNames(11));
	Team teamThree = new Team("Freaks", Utils.randomNames(11));
	Team teamFour = new Team("Geeks", Utils.randomNames(11));
	// create collective matches
	CollectiveMatch collMatchOne = new CollectiveMatch(teamOne, teamTwo);
	CollectiveMatch collMatchTwo = new CollectiveMatch(teamThree, teamFour);
	// create list of matches
	List<Match> tournament = new ArrayList<>();
	tournament.add(indMatchOne);
	tournament.add(indMatchTwo);
	tournament.add(collMatchOne);
	tournament.add(collMatchTwo);
	// Games begin
	// Half time break!
	Utils.setHalfTimeScore(tournament);
	// Games go on
	// Games are over!
	Utils.setFinalScore(tournament);
	// printing scores
	for (Match match : tournament) {
	    match.showResult();
	}
    }
}
