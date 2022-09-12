package observer;

public class Mom implements Observer {
	private Subject baby;

	public Mom(Subject baby) {
		this.baby = baby;
		baby.registerObserver(this);
	}

	public void update(Cry cry) {

		if(cry.equals(Cry.ANGRY)){
			System.out.println("Mom hugs " + ((Baby)baby).getName());
			((Baby)baby).receiveLove();
		} else if(cry.equals(Cry.HUNGRY)){
			System.out.println("Mom feeds " + ((Baby)baby).getName());
			((Baby)baby).eat();
		} else if(cry.equals(Cry.WET)){
			System.out.println("Mom changes " + ((Baby)baby).getName());
			((Baby)baby).getChanged();
		}
	}

}
