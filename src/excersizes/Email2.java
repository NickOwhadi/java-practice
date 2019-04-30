package excersizes;
import java.util.*;
public class Email2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String email = scan.next();
		String firstName =email.substring(0,email.indexOf("_"));
		String firstNameC=firstName.substring(0,1).toUpperCase()+firstName.substring(1);
		String lastName =email.substring(email.indexOf("_")+1,email.indexOf("@"));
		String lastNameC =lastName.substring(0,1).toUpperCase()+lastName.substring(1);
	    String domain = email.substring(email.indexOf("@")+1,email.indexOf("."));
	    String topLevelDomain = email.substring(email.indexOf(".")+1,email.length());
	    System.out.println("First name: "+firstNameC);
	    System.out.println("Last name: "+lastNameC);
	    System.out.println("Domain: "+domain);
	    System.out.println("Top-Level Domain: "+topLevelDomain);
	}

}
