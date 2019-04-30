package day19;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your word");
         String word = scan.next();
         String reverse = "" ;
         int idx = word.length()-1;
         while (idx >= 0) {
        reverse = reverse + word.charAt(idx);
        	idx--; 
         }
        if (word.equalsIgnoreCase(reverse)){
        	System.out.println("It is Palendrome");
        }else {
        	System.out.println("It is not Palendrome");
        }
	}

}
