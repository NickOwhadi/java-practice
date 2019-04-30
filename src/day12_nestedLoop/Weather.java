package day12_nestedLoop;
import java.util.*;
public class Weather {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How is the weather today");
        String weather = scan.next().toLowerCase();
switch(weather) {
case "sunny":
	System.out.println("Go to Park");
	break;
case "hot":
	System.out.println("Go swiming");
	System.out.println("Code java");
	break;
case "windy":
	System.out.println("fly a kite");
	System.out.println("Code java");
	break;
case "rainy":
	System.out.println("Go shopping");
	System.out.println("Code java");
	break;
case "snow":
	System.out.println("chain your tyres");
	System.out.println("Go skiing");
	System.out.println("Code java");
	break;
	default:
		System.out.println("Code Java in any other weather");
	
	}
System.out.println("#### END OF PROGRAMM #######");
	}
}
