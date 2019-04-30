package day8_FlowControl;
import java.util.*;
public class ifElseWithScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//passing = 65 Percentage
		//yourScorePersentage = take from scanner
		//check if you passed or failed
		Scanner scan = new Scanner(System.in);
		int passingScore = 65;
		System.out.println("what is your score");
		int myscore = scan.nextInt();
		if (myscore >= passingScore) {
			System.out.println("You Passed");
		}else {
			System.out.println("YOU FAILD");
		}
		System.out.println("Java is fun");
	}

}
