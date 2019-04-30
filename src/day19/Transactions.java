package day19;
import java.util.*;
public class Transactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);
    System.out.println("enter your bodget");
    double balance = scan.nextDouble();
    int counter = 0;
    
    while (balance >0) {
    	counter++ ;
    	System.out.println("what is your trans: " + counter + " amount");
    	double transaction = scan.nextDouble();
    	//balance = balance - transaction/ 
    	balance -= transaction;
    	//continue;go to top of the loop
    	
    	if (balance <= 0) {
    		System.out.println("it is going negative");
    	}
    	System.out.println("Current balance is: "+ balance); 
    }
    System.out.println("You have insufficent funds for any more, your balance is "+ balance);
    System.out.println("number of transaction: " + counter);
	}

}
