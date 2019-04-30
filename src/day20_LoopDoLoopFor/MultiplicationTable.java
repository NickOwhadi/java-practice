package day20_LoopDoLoopFor;
import java.util.*;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter Number");
     int num = scan.nextInt();
     if(num<1 || num>10) {
    	 System.out.println("ERROR:Invalid input");
    	 //return;
    	  System.exit(0);
     }
     for (int i =1; i<=10; i++) {
    	 System.out.println(num +" X " + i + " = " + num * i);
    	 
     }
	}

}
