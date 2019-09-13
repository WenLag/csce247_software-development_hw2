package csce246.assignments.observer;

public class Teacher implements Observer {
	private Subject watchman;
	public Teacher(Subject watchman) {
		this.watchman = watchman;
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
