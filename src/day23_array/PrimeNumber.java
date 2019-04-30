package day23_array;

import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan = new Scanner(System.in);
       int number = new Scanner(System.in).nextInt();
		for (int i = 2; i <number ; i++) {
			if (number%i ==0) {
				System.out.println("this is not a prime number");
				return;
			}
	}
		System.out.println("this is a prime number");
	}

}
