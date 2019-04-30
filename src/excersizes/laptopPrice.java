package excersizes;
import java.util.*;
public class laptopPrice {
public static void main(String[] args) {
double price = 0;
String storageType, screenType, cpu, screenResolution;
int ram = 0 ;
int memory = 0;
Scanner scan = new Scanner(System.in);
//WRITE YOUR CODE HERE
System.out.println("Select screen size:");
screenType = scan.next();
switch (screenType) {
case "13.3":
	price = price + 200.0;
	break;
case "15":
	price = price + 300.0;
	break;
case "17.3":
	price = price + 400.0;
	break;
	default:
}
System.out.println("Select CPU type:");
cpu = scan.next();
switch (cpu) {
case "i3":
	price = price + 150.0;
	break;
case "i5":
	price = price + 250.0;
	break;
case "i7":
	price = price + 350.0;
	break;
	default:
}
System.out.println("Select RAM size:");
ram = scan.nextInt();
price = price + ram/4*50;
System.out.println("Select storage type:");
storageType = scan.next();
System.out.println("Enter memory size:");
memory = scan.nextInt();
switch (storageType) {
case "HDD":
	price = price + memory/500*50;
	break;
case "SSD":
	price = price + memory/500*100;
	break;
	default:
}
System.out.println("Enter screen resolution:");
screenResolution = scan.next();
switch (screenResolution) {
case "FULLHD":
	price = price + 100;
	break;
case "4K":
	price = price + 200;
	break;
	default:
}
System.out.println("Laptop price is: $" + price);
}
}
