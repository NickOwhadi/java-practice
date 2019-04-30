package day27_extraPractice;
import java.util.*;
public class Season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter the value");
    int value = scan.nextInt();
    if(value >= 1 && value<=2 || value==12) {
    	System.out.println(" It is winter season");
    }else if(value >= 3 && value<=5 ) {
    	System.out.println(" It is spring season");
    }else if(value >= 6 && value<=8 ) {
    	System.out.println(" It is summer season");
    }else if(value >= 9 && value<=11 || value==12) {
    	System.out.println(" It is fall season");
    }else {
    	System.out.println("Invalid month");
    }
    String message="";
    switch(value) {
    case 1: case 2: case 3:
    	message = "winter";
    	break;
    case 4: case 5:case 6:
    	message = "Sprint";
    	break;
    case 7:case 8:case 9:
    	message = "summer";
    	break;
    case 10:case 11:case 12:
    	message = "fall";
    	break;
    	default:
    	message = "invalid number!";
    		break;
    }
    System.out.println(message);	
    	
    
	}

}
