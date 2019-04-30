package day15_string_manipulations;
import java.util.*;
public class nestedStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("enter your moji");
String emoji = ":)";
if(emoji.length()!=2) {
	System.out.println("Invalid emoji");
	return;
}
char first = emoji.charAt(0);
char second =emoji.charAt(1);
 if(first ==':') {
	}else if(second == ')'){
		System.out.println("smile");
	}else if(second == ')'){
		System.out.println("sad");
	}else if(second == '/') {
		System.out.println("upset");
	}else {
		System.out.println("Invalid emoji");
	}
	}
}


