package strategy;

import java.util.ArrayList;

public class RunBehavior extends MoveBehavior {
    private ArrayList<String> character = new ArrayList<String>();

    public void move(ArrayList<String> character) {
        move(character, 2);
    }
}
