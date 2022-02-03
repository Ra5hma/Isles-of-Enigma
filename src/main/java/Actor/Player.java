package Actor;

public class Player extends Actor{
    private int exp;
    private int level;
    private int gold;

    public Player(String name, int health, int exp, int level, int gold) {
        super(name, health);
    }
}
