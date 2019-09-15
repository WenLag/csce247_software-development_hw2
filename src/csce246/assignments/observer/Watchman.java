package csce246.assignments.observer;

import java.util.ArrayList;

/**
 * Watchman.java - class that has actions methods for the observers.
 * @author Nguyen
 *
 */

public class Watchman implements Subject  {
	
	ArrayList<Observer> observers;
	int warning;
	/**
	 * watchman constructor
	 */
	public Watchman(){
		observers = new ArrayList<Observer>();
	}
	
	/**
	 * Retrieve new observer and add it to the ArrayList
	 */
	public void registerObserver(Observer observer) {
		observers.add(observer);
		
	}
	
	/**
	 * Remove observers who do not want to be in the ArrayList anymore
	 */
	public void removeObserver(Observer observer) {
		int i = observers.indexOf(observer);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	/**
	 * Notify observers about the warnings
	 */
	public void notifyObserver() {
		for (int i = 0; i < observers.size(); i++) {
			observers.get(i).update(warning);;
			
		}
		
	}
	
	/**
	 * method that issues the warning severity to the watchman and print out how many trumpet is played
	 * @param warning
	 * @return warning number
	 */
	public void issueWarning(int warning) {
		this.warning = warning;
		if (warning==1) {
			System.out.println("WARNING: 1 trumpet as played!");
			
		}
		
		else if(warning==2) {
			System.out.println("WARNING: 2 trumpets were played!");
			
		}
		
	
	}
}
