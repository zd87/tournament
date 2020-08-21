package tournament;

public abstract class Adversary {

    private String name;

    public Adversary(String name) {
	this.name = name;
    }

    public String getName() {
	return name;
    }
}
