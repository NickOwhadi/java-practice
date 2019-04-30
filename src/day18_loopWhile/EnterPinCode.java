package day18_loopWhile;

import java.util.*;

public class EnterPinCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int secretP = 1234;
		int pincode = 0;
		while (pincode != secretP) {
			System.out.println("enter Pin Number");
			pincode = scan.nextInt();
		}
		System.out.println("Access Granted");
	}

}
