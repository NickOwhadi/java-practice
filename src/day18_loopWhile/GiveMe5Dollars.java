package day18_loopWhile;
import java.util.*;
public class GiveMe5Dollars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan=new Scanner(System.in);
    int dollars = 0;
    while(dollars !=5) {
    	System.out.println("Please give me $ 5.00");
    	dollars =scan.nextInt();
    }
    System.out.println("Thanks for money");
	}

}
