package excersizes;
import java.util.*;
public class GuestNames {
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter guest name:");
	    String guestName = input.next();
	    System.out.println("Do you want to enter new guest name");
	     String answer = input.next();
	     String guests ="";
	     guests ="Guest's list: " + guestName;
	    // your code 
	    // ------------------------------------------
	    while(answer.equalsIgnoreCase("yes")){
	        System.out.println("Enter guest name:");
	      guestName = input.next();
	      guests +=" ," + guestName ;
	        System.out.println("Do you want to enter new guest name");
	        answer = input.next();
	    }
	    
	   System.out.println(guests); 
	  }
	}

