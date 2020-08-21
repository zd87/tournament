package tournament;

import java.util.ArrayList;
import java.util.List;

public class Team extends Adversary {

    private List<Player> players = new ArrayList();

    public Team(String name, List<String> playerNames) {
	super(name);
	for (String playerName : playerNames) {
	    this.players.add(new Player(playerName));
	}
    }

    public List<Player> getPlayers() {
	return players;
    }

    public void add(Player player) {
	players.add(player);
    }
}
