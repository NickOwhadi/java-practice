package dya11_whileLoop;
import java.util.*;
public class loginTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
String validUsername = "cybertek@mail.com";
String validPassword = "WoddenSpoon123";
System.out.println("Enter username");
String username = scan.next();
System.out.println("Enter password");
String password = scan.next();

if(username.equalsIgnoreCase(validUsername) && password.equals(validPassword )) {
	System.out.println("Login Successful, Welcome");
}
else if(!username.equalsIgnoreCase(validUsername) && !password.equals(validPassword )) {
	System.out.println("Invalid usename and Invalid password");
	}
else if(username.equalsIgnoreCase(validUsername) && !password.equals(validPassword )) {
	System.out.println("Invalid password");
	}
else if(!username.equalsIgnoreCase(validUsername) && password.equals(validPassword )) {
	System.out.println("Invalid usename");
	}
}
}
