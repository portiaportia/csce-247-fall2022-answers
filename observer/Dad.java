package observer;

import java.util.Random;

public class Dad implements Observer {
	private Subject baby;
	private Random rand;

	public Dad(Subject baby) {
		rand = new Random();
		this.baby = baby;
		baby.registerObserver(this);
	}

	public void update(Cry cry) {
		switch (rand.nextInt(3)) {
			case (0):
				System.out.println("Dad puts a pillow over his head");
				break;
			case (1):
				System.out.println("Dad nudges mom");
				break;
			case (2):
				System.out.println("Dad screams....aaaaaaaaaa");
				break;
		}

	}

}
