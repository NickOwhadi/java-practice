package excersizes;
import java.util.*;
public class tipCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WRITE YOUR CODE HERE
		   Scanner scan = new Scanner(System.in);
		  double totalToPay =0;
		  double totalTip = 0;
		  double totalPerPerson = 0;
		  double tipPerPerson = 0;
		  System.out.print("Split:");
		  String answer=scan.next();
		  
		 
		  System.out.print("Number of people:");
		  int numberOfPeople = scan.nextInt();
		  System.out.print("Check amount:");
		  double checkAmount=scan.nextDouble();
		  System.out.print("Service Quality:");
		  String serviceQuality=scan.next();
		  
		  switch (numberOfPeople) {
			  case 1:
				System.out.println("Number of people entered: " + "&");
			  break;
			  case 2:
					System.out.println("Number of people entered: " + "&&");
			  break;
			  case 3:
					System.out.println("Number of people entered: " + "&&&");
			  break;
			  case 4:
					System.out.println("Number of people entered: " + "&&&&");
			  break;
			  case 5:
					System.out.println("Number of people entered: " + "&&&&&");
			  break;
			  case 6:
					System.out.println("Number of people entered: " + "&&&&&&");
			  break;
			  case 7:
					System.out.println("Number of people entered: " + "&&&&&&&");
			  break;
			  case 8:
					System.out.println("Number of people entered: " + "&&&&&&&&");
			  break;
			  case 9:
					System.out.println("Number of people entered: " + "&&&&&&&&&");
			  break;
					default:
					break;
					}
		  switch (serviceQuality) {
		  case "Poor":
			  totalTip = totalTip + checkAmount * 0.05;
			  break;
		  case "Fair":
			  totalTip = totalTip + checkAmount * 0.10;
			  break;
		  case "Good":
			  totalTip = totalTip + checkAmount * 0.15;
			  break;
		  case "Great":
			  totalTip = totalTip + checkAmount * 0.20;
			  break;
		  case "Excellent":
			  totalTip = totalTip + checkAmount * 0.25;
			  break;
			  default:
			  break;
		  }
		  totalToPay = checkAmount + totalTip;
 if (answer.equalsIgnoreCase("yes")) {
			totalPerPerson = totalToPay/numberOfPeople;
			tipPerPerson = totalTip/numberOfPeople;
		  }else if (answer.equalsIgnoreCase("no")) {
			  totalPerPerson = checkAmount/numberOfPeople;
				  tipPerPerson = totalTip;
		  }
 System.out.println("Total to pay: " + totalToPay);
 System.out.println("Total tip: " + totalTip);
 System.out.println("Total per person: " + totalPerPerson);
 System.out.println("Tip per person: " + tipPerPerson );
	}
}