package csce246.assignments.observer;
/**
 * Teacher.java - an observer class that gets updated on warning
 * @author Nguyen
 *
 */
public class Teacher implements Observer {
	private Subject watchman;
	public Teacher(Subject watchman) {
		this.watchman = watchman;
		this.watchman.registerObserver(this);
	}
	public void update(int warning) {
		if (warning == 1) {
			System.out.println("Teacher: Helps get every kid home safe.");
			
		}
		
		else if (warning == 2) {
			System.out.println("Teacher: brings all student to the underground shelter");
		}
	}
}
