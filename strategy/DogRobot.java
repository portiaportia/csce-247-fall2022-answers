package strategy;

public class DogRobot extends Robot {

    public DogRobot(String name) {
        super(name);
        character.add("++o");
        this.moveBehavior = new CrawlBehavior();
    }

    public String toString() {
        return name + " is a dog robot";
    }

}
