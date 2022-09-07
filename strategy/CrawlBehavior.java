package strategy;

import java.util.ArrayList;

public class CrawlBehavior extends MoveBehavior {
    private ArrayList<String> character = new ArrayList<String>();

    public void move(ArrayList<String> character) {
        move(character, 1);
    }
}
