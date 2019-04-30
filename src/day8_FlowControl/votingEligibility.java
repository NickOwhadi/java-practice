package day8_FlowControl;
import java.util.*;
public class votingEligibility {
public static void main(String[] args) {
	/*
	 * 
	 */
	int votingAge = 18;
	int myAge;
	Scanner scan= new Scanner(System.in);
	System.out.println("How old are you? ");
	myAge = scan.nextInt();
	if(myAge >= votingAge) {
		System.out.println("You are eligilble");
		System.out.println("you were eligible for " + (myAge -votingAge));
	}else {
		System.out.println("you are not elegible"); 
		System.out.println("you have still " +(votingAge - myAge) +" years to wait");
	}
}
}
