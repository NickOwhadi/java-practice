package day13_ternry_string_intro;
import java.util.*;
public class carSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Which type of car you are interested in?");
		System.out.println("1)American\n 2)Japanese\n 3)Germans\n 4)Italians\n 5)Korean");
		
		int carType = scan.nextInt(); 
		
		double averagePrice = 0.0;
		String carOptions ="";
		String carOrigin="";
		switch(carType) {
		case 1:
			averagePrice = 33000;
			carOptions =" Ford, Dodge, Tesla, Chevrolet, Lincoln";
			carOrigin ="Americans";
			break;
		case 2:
			averagePrice = 33000;
			carOptions =" Toyota, Mitsubisi, Honda, Subaru, Mazda";
			carOrigin ="Japanese";
			break;
		case 3:
			averagePrice = 55000.0;
			carOptions ="  Bmw, VW, Audi, Mercedes, Porsche";
			carOrigin ="Germans";
			break;
		case 4:
				averagePrice = 55000.0;
				carOptions =" Alfa Romeo, Ferrari, Lamborghini";
				carOrigin ="Italians";
				break;
		case 5:
			averagePrice = 25000.0;
			carOptions ="Kia, Hyundai, Daewoo";
			carOrigin ="Koreans";
			break;	
			default:
				System.out.println("Car type  is not available");
			return;
			
		}
		System.out.println("your car is "+carOrigin+" car and your options are "+carOptions);
		System.out.println("Average Price"+averagePrice);
		
	}
}
