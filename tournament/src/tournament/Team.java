package tournament;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String name;

    private List<Player> players = new ArrayList();

    public Team(String name, List<String> playerNames) {
	this.name = name;
	for (String playerName : playerNames) {
	    this.players.add(new Player(playerName));
	}
    }

    public String getName() {
	return name;
    }

    public List<Player> getPlayers() {
	return players;
    }

    public void add(Player player) {
	players.add(player);
    }
}
