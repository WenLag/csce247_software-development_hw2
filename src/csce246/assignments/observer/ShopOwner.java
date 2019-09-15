package csce246.assignments.observer;
/**
 * ShopOwner.java - an observer class that gets updated on warning
 * @author Nguyen
 *
 */
public class ShopOwner implements Observer {
	private Subject watchman;
	public ShopOwner(Subject watchman) {
		this.watchman = watchman;
		watchman.registerObserver(this);
	}
	
	public void update(int warning) {
		
		if (warning == 1) {
			System.out.println("Shop Owner: Close down shop and head home");
			
		}
		
		else if (warning == 2) {
			System.out.println("Shop Owner: Drops Everything and find nearest hideout");
		}
	}
}
