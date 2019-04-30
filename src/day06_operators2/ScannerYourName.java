package day06_operators2;
import java.util.Scanner;
public class ScannerYourName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Hi, Waht is your name?");
		String name = scan.next();
		System.out.println("Nice to meet you, " + name);
		System.out.println("Where are you from?");
		String country = scan.next();
		System.out.println(country + "!!!!!! No realy, so sorry for you!!!!");
		
	}
	

}
