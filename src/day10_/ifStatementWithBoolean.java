package day10_;

public class ifStatementWithBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isBreakTime = false;
		if(isBreakTime == true) {
			System.out.println("BREAK TILL 8:30 PM");
		}else {
			System.out.println("No Break time yet.");
		}
		
		if(isBreakTime) {
			System.out.println("BREAK TILL 8:30 PM");
		}else {
			System.out.println("No Break time yet.");
		}
		boolean classTime = false;
		if(classTime) {
			System.out.println("Study");
		}else {
			System.out.println("Take a walk");
		}
		boolean qualified = false;
		if(qualified == false) {
			System.out.println("Your application was not approved");
		}
	}

}
