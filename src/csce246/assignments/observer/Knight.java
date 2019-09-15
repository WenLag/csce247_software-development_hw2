package csce246.assignments.observer;
/**
 * Knight.java - an observer class that gets updated on warning
 * @author Nguyen
 *
 */
public class Knight implements Observer {
	private Subject watchman;
	public Knight(Subject watchman) {
		this.watchman = watchman;
		this.watchman.registerObserver(this);
	}
	public void update(int warning) {
		if (warning == 1) {
			System.out.println("Knight: helps everyone get home safe.");
			
		}
		
		else if (warning == 2) {
			System.out.println("Knight: Prepares for battle.");
		}
	}
}
