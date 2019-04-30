package day10_;
import java.util.*;
public class creditClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your score");
		int creditScore = scan.nextInt();;
		if (creditScore >= 750 && creditScore <= 850) {
			System.out.println("Excellent");
		}
		else if (creditScore >= 700 && creditScore <= 749) {
			System.out.println("Good");
		}
	
	else if (creditScore >= 650 && creditScore <= 699) {
		System.out.println("fair");
	}
	else if (creditScore >= 550 && creditScore <= 649) {
			System.out.println("poor");
		}
	else if (creditScore >= 0 && creditScore <= 549) {
			System.out.println("Excellent");
		}
	else {
		System.out.println("invalid score");
	}
	}
	
	
}
