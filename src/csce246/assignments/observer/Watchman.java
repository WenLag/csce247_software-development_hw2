package csce246.assignments.observer;

import java.util.ArrayList;

public class Watchman implements Subject  {
	private int warning;
	ArrayList<Observer> observers;
	public Watchman(){
		observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer observer) {
		observers.add(observer);
		
	}
	
	public void removeObserver(Observer observer) {
		int i = observers.indexOf(observer);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	public void notifyObserver() {
		for (int i = 0; i < observers.size(); i++) {
			observers.get(i).update(warning);;
			
		}
		
	}
	public int issueWarning(int warning) {
		this.warning = warning;
		if (warning==1) {
			System.out.println("WARNING: 1 trumpet as played!");
			
		}
		
		else if(warning==2) {
			System.out.println("WARNING: 2 trumpets were played!");
			
		}
		return warning;
	
	}
}
