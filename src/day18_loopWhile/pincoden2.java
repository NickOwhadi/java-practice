package day18_loopWhile;

import java.util.Scanner;

public class pincoden2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int secretP = 1234;
		int pincode = 0;
		int atempt =1;
		while (pincode != secretP && atempt <=3) {
			System.out.println("enter Pin Number");
			pincode = scan.nextInt();
			atempt++;
			if(atempt ==3 && pincode != secretP) {
				System.out.println("Card is blocked");
				return;
			}
		}
		System.out.println("Access Granted");
	}

}
