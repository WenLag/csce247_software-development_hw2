package csce246.assignments.observer;

/**
 * Subject.java - interface class that the Watchman.java implements
 * @author Nguyen
 *
 */
public interface Subject {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObserver();
}
