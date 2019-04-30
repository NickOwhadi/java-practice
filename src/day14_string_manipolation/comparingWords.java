package day14_string_manipolation;
import java.util.*;
public class comparingWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	System.out.println("enter word1");
	String word1 = scan.next();
	System.out.println("word2");
	String word2 = scan.next();
	if(word1.length()>word2.length()) {
		System.out.println(word1+" value is longer");
	}
	else if(word2.length()>word1.length()) {
		System.out.println(word2+" value is longer");
	}
	else {
		System.out.println(word1 +" and " + word2 +" are equal");
	}
	
	}
}
