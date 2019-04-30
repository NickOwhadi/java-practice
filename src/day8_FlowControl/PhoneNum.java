package day8_FlowControl;
import java.util.*;
public class PhoneNum {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int areaCode, phoneNumber;
		// TODO Auto-generated method stub
System.out.println("Please enter your area code ");
areaCode = scan.nextInt();
System.out.println("Please enter your phone number: ");
phoneNumber = scan.nextInt();
// (303)-2364587
String phoneNumbers= "(" + areaCode + ")-" + phoneNumber;
System.out.println("Calling number: " + phoneNumbers);

	}

}
