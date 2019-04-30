package day7_scanner;

public class comparison_ {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		//==
		System.out.println(5 ==5);
		System.out.println(50 ==5);
		int searchCount = 5000;
		System.out.println(searchCount == 5000);
		int expectedCount = 5010;
		System.out.println(searchCount == expectedCount);
		System.out.println(searchCount >= expectedCount);
		System.out.println(searchCount <= expectedCount);
		int speedLimit = 55;
		int CurrentSpeed = 75;
		System.out.println(CurrentSpeed == speedLimit);
		boolean atLimit = CurrentSpeed == speedLimit;
		System.out.println("At Speed Limit: "+ atLimit);
		boolean overlimit = CurrentSpeed > speedLimit;
		System.out.println("Pver speed limit: " + overlimit);
		boolean underLimit = speedLimit > CurrentSpeed;
		System.out.println("underlimit: " + underLimit);
		
		double balance = 1050.0;
		boolean broke = balance <= 0.0;
		System.out.println("Broke? "  + broke);
		
		double transaction = 155.5;
		broke =(balance - transaction) < 0;
		System.out.println("Will make broke/negative? -" + broke);
		System.out.println("balance: " + balance);
		System.out.println("Transaction: " + transaction);
		
		
	}

}
