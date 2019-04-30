package excersizes;
import java.util.*;
public class MethodId {
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    String s = inp.next();
	    person(s) ;
	  }
	  
	   public static void person(String info) 
		{
		
			//your code here
			System.out.println("person name: "+info.substring(0,info.indexOf(","))+" last name: "+
			info.substring(info.indexOf(",")+1,info.lastIndexOf(","))+" age:"+info.substring(info.lastIndexOf(",")+1));
		
		}//end person
	  
	}