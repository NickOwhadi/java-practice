package day20_LoopDoLoopFor;
import java.util.*;
public class Zamby1 {

	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int inhabitants = scan.nextInt();
	    int idx = 0;
	    while(inhabitants>0){
	    	
	      System.out.println("Day " + idx + " [" + inhabitants + "]");
	      inhabitants = inhabitants /2;
	      idx++;
	      }
	    System.out.println("---- EXTINCT ----");
	  }
	}

