package day30_customMethod;

import java.util.Scanner;

public class CustomMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
introduce();
	}
public static void introduce() {
	Scanner scan = new Scanner(System.in);
	System.out.println("PLease enter your name");
	String name=scan.next();
	System.out.println("Nice to meet you, "+name);
	
}
}
