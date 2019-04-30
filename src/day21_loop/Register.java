package day21_loop;
import java.util.*;
public class Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        double totalPrice = 0.0;
        String items ="";
        
        System.out.println("How many items");
    	int howMany= scan.nextInt();
        
        for (int count = 1;  count<=howMany; count++) {
        	
        	System.out.println("item name" + count+"?");
        	String itemName = scan.next();
        	System.out.println("how much is "+ itemName+"?");
        	double itemPrice = scan.nextDouble();
        	items += itemName + " ,";
        	totalPrice += itemPrice;
        }
        System.out.println("Your items: " + items);
        System.out.println("Your total price: "+ totalPrice);
	}

}
