package strategy;

public class HumanRobot extends Robot {

    public HumanRobot(String name) {
        super(name);
        character.add(" 0");
        character.add("-|-");
        character.add("/ \\");
        this.moveBehavior = new WalkBehavior();
    }

    public String toString() {
        return name + " is a human robot";
    }
}
