package day27_extraPractice;
import java.util.*;
public class TernaryOperato {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
    int time = 20;
    String result=(time<18)? "Good afternoon": "Good evening";
    System.out.println(result);
	System.out.println(time<18 && time>0? "Good afternoon": "Good evening");	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the score:");
	int score = scan.nextInt();
	System.out.println(score>=64?"Passed":"Failed");
		
	}

}
