package csce246.assignments.observer;

public class Knight implements Observer {
	private Subject watchman;
	public Knight(Subject watchman) {
		this.watchman = watchman;
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
