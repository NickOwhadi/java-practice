package excersizes;
import java.util.Scanner;
public class PrintAlphabet {
	 public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    char start = scan.next().charAt(0);
		    char end = scan.next().charAt(0);
		    
		    do{System.out.print(start);
        	start++;
        }while(start<=end);
		  }
		}