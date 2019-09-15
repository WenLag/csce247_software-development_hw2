package csce246.assignments.observer;
/**
 * TownDriver.Java - main class for demonstrating the java observer pattern 
 * @author Nguyen
 * @version 1.0
 * 
 */
public class TownDriver {
	public static void main(String[] args) {
		System.out.println("A Happy Little City");
		
		Watchman watchman = new Watchman();
		Observer fredrick = new ShopOwner(watchman);
		Observer lillian = new Teacher(watchman);
		Observer monte = new Knight(watchman);
		
		System.out.println("\n-----------------------\n");
		
		
		watchman.issueWarning(1);
		watchman.notifyObserver();
		
		System.out.println("\n-----------------------\n");
		
		watchman.issueWarning(2);
		watchman.notifyObserver();
	
	}
}
