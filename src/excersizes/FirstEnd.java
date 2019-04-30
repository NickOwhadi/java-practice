package excersizes;
import java.util.*;
public class FirstEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    
		    Scanner input = new Scanner(System.in);
		    String[] words = {"hello", "why", "by", "apple" , "note"};
		   

		    //TODO: Write your code below
		    String firstsEnds="";
		    String firstEnd="";
		    for(int i=0; i<words.length; i++){
		      firstEnd=words[i].substring(0,1)+words[i].substring(words[i].length()-1);
		      firstsEnds +=firstEnd+", ";
		    }
		    System.out.println("["+firstsEnds.substring(0,firstsEnds.length()-2)+"]");
		  }
		
	}


