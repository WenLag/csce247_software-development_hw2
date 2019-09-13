package csce246.assignments.observer;
/**
 * 
 * @author Nguyen
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
		watchman.registerObserver(fredrick);
		watchman.registerObserver(lillian);
		watchman.registerObserver(monte);
		
		watchman.issueWarning(1);
		
		
		System.out.println("\n-----------------------\n");
		
		watchman.issueWarning(2);
		
	
	}
}
