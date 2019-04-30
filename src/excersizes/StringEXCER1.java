package excersizes;
import java.util.*;
public class StringEXCER1 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    
	    String reversed = "";
	    //TODO: start your code here
	    String[] words =  sentence.split(" ");

	    
	    for(int i = words.length - 1; i >= 0 ; i--)
	    {
	       System.out.println(words[i]);
	    }
	    
	    //End your code here. do not modify below statement
	    System.out.print("");
	    
	  }
	}