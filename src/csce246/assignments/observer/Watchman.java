package csce246.assignments.observer;

import java.util.ArrayList;

public class Watchman implements Subject  {
	
	ArrayList<Observer> observers;
	public Watchman(){
		observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer observer) {
		observers.add(observer);
		
	}
	
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObserver(int warning) {
		for (int i = 0; i < observers.size(); i++) {
			observers.get(i).update(warning);;
		}
		
	}
	public void issueWarning(int warning) {
		if (warning==1) {
			System.out.println("WARNING: 1 trumpet as played!");
			notifyObserver(warning);
		}
		
		else if(warning==2) {
			System.out.println("WARNING: 2 trumpets were played!");
			notifyObserver(warning);
		}
	
	}
}
