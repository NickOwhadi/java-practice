package day27_extraPractice;

import java.util.*;

public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age:");
		int age = scan.nextInt();
		if (age > 0 && age < 21) {
			System.out.println("Underage!!");
		} else if (age > 0 && age > 21) {
			System.out.println("You are good to go!");
		} else {
			System.out.println("Invalid age");
		}
		
		
	}

}
