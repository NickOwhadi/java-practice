package excersizes;
import java.util.Scanner;
public class SwapEmail {
		  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    String email = scan.next();
		    
		     
		     
		    
		  if(email.contains("_")){
			  String firstName =email.substring(0,email.indexOf("_"));
			  String lastName =email.substring(email.indexOf("_")+1,email.indexOf("@"));
			  String swapEmail= email.replace(lastName, firstName).replaceFirst(firstName, lastName);
			  System.out.println(firstName);
			  System.out.println(lastName);
			  System.out.println(swapEmail);
		     
		   
		  }else{
		    System.out.println(email);
		  }  
		    
		    
		  }
		}


