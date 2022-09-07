package strategy;

import java.util.ArrayList;

public abstract class Robot {
    protected String name;
    protected ArrayList<String> character;
    protected MoveBehavior moveBehavior;

    public Robot(String name) {
        this.name = name;
        character = new ArrayList<>();
    }

    public void setMoveBehavior(MoveBehavior moveBehavior) {
        this.moveBehavior = moveBehavior;
    }

    public void move() {
        moveBehavior.move(character);
    }

    public abstract String toString();

    public String getName() {
        return name;
    }
}
