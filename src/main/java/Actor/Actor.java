package Actor;

public class Actor {
    private String name = "";
    private int health = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Actor (String name, int health){
        this.name = name;
        this.health = health;
    }
}
