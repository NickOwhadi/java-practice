package day22_practicingloops;

import java.util.*;

public class Monthsloop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month;
		do {
			System.out.println("enter number");
			month = scan.nextInt();
		} while (month >= 1 && month <= 12);
        System.out.println("Invalid month - " + month);
	}
}
