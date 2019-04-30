package excersizes;

import java.util.*;

public class CarEstimate {
	public static void main(String[] args) {
		// DO NOT CHANGE
		double premium = 0;
		int accidentsAmount = 0;
		int daysDrivenToWorkOrSchool = 0;
		int milesToWorkOrSchool = 0;
		String vehicleOwnership = "";
		String vehicleUsage = "";
		String continuousInsurance = "";
		String education = "";
		String name = "";
		String referenceNumber = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the CountyFarm car insurance!");
		// WRITE YOUR CODE HERE
		 System.out.println("Enter your name");
	        name = scan.nextLine();
	        System.out.println("Do you have a US driver license?");
	        String answer = scan.next();
	        if(answer.equalsIgnoreCase("No")) {
	        	System.out.println("Invalid data!");
	        	System.exit(0);
	        }
	        System.out.println("Enter your zip code");
	        int zipCode = scan.nextInt();
	        if(zipCode == 20910 || zipCode == 20740) {
	        	premium =premium + 60;
	        }else if(zipCode == 22102 || zipCode == 22103) {
	        	premium =premium + 30;
	        }else {
	        	premium =premium + 50;
	        }
	        System.out.println("Is this vehicle Owned, Financed, or Leased?");
	        vehicleOwnership = scan.next();
	        if (vehicleOwnership.equalsIgnoreCase("Owned")) {
	        	premium = premium + 10;
	        }else {
	        	premium =premium +20;
	        }
	        System.out.println("How is this vehicle primarily used?");
	        vehicleUsage = scan.next();
	        if(vehicleUsage.equalsIgnoreCase("Business")) {
	        	premium = premium + 50;
	        }else if(vehicleUsage.equalsIgnoreCase("Pleasure")) {
	        	premium = premium + 10;
	        }else if(vehicleUsage.equalsIgnoreCase("Commute")) {
	        	premium = premium + 20;
	        	System.out.println("Days Driven To Work And/Or School");
	        	daysDrivenToWorkOrSchool=scan.nextInt();
	        	premium =premium + daysDrivenToWorkOrSchool * 5;
	        	System.out.println("Miles Driven To Work And/Or School");
	        	milesToWorkOrSchool = scan.nextInt();
	        	premium = premium + milesToWorkOrSchool * 1;
	        }
	        System.out.println("How old are you?");
	        int age = scan.nextInt();
	        if(age<16) {System.out.println("Invalid data!");
	    	System.exit(0);
	        	
	        }else if(age>=16 && age<18) {
	        	premium = premium * 20;
	        }else if(age>=18 && age <= 21) {
	        	premium = premium * 6;
	        }else if(age > 21 && age < 25) {
	        	premium = premium * 2;
	        }
	        System.out.println("How many years you've been driving?");
	        int experience = scan.nextInt();
	        if(experience<0 || (age-experience)<16) {
	        	System.out.println("Invalid data!");
	        	System.exit(0);
	        }else {
	        	premium = premium - experience *5;
	        }
	        System.out.println("Have you had any accidents in the last 5 years?");
	        answer = scan.next();
	        if (answer.equalsIgnoreCase("yes")) {
	        	System.out.println("How many?");
	        	accidentsAmount = scan.nextInt();
	        	premium = premium + premium * .2 * accidentsAmount ;
	        }
	        System.out.println("Have you had continuous insurance for the past 12 months?");
	        continuousInsurance = scan.next();
	        if(continuousInsurance.equalsIgnoreCase("no")) {
	        	premium = premium * 2;
	        }
	        scan.nextLine();
	        System.out.println("What is the highest level of education you have completed?");
	        education = scan.nextLine();
	        if (education.equalsIgnoreCase("PhD") || education.equalsIgnoreCase("Bachelors")
	        	|| education.equalsIgnoreCase("Masters")){
	        	premium = premium - premium * .05;
	        }else if(education.equalsIgnoreCase("Doctors")) {
	        	premium = premium -premium * .1;
	        }else if(education.equalsIgnoreCase("Less than High School")) {
	        	premium = premium + premium * .05;
	        }
	        System.out.println(name +", here's your quote!");
	        System.out.println("Start Your Policy Today For: $" + premium);
	        referenceNumber =  name.toUpperCase().substring(0, 2) + age 
	        		+ name.substring(name.length()-2) + zipCode + education.replace(" ","");
	        		referenceNumber=referenceNumber.toUpperCase();
	        		System.out.println("Reference number: "+ referenceNumber);
		}
}
