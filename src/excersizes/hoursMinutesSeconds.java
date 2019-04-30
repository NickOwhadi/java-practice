package excersizes;
import java.util.*;
public class hoursMinutesSeconds {
	

	
	  public static void main(String[] args) {
	    //ENTER CODE HERE
	    int itemPrice, quarters, dimes, nickels;
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter price in cents :");
	    itemPrice =scan.nextInt();
	    quarters = (100-itemPrice)/25;
	    dimes = ((100-itemPrice)%25)/10;
	    nickels = ((100-itemPrice)%25)%10;
	    if (itemPrice<25)
	    
	    {
	      System.out.println("Invalid price!");
	      
	    } else if(itemPrice>100){
	    	System.out.println("Invalid price!");
	    }
	    else{
	      System.out.println("Your change is " +
	      quarters +" quarters, " + dimes + " dimes, and "
	      + nickels + " nickles.");
	    }
	    
	  }
	}

