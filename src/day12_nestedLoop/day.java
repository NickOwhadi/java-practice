package day12_nestedLoop;
import java.util.Scanner;
public class day {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Day:");// TODO Auto-generated method stub
int day =scan.nextInt();
switch(day) {
case 1:
	System.out.println("Monday");
	break;
case 2:
	System.out.println("Tuesday");
	break;
case 3:
	System.out.println("Wednesday");
	break;
case 4:
	System.out.println("Thuersday");
	break;
case 5:
	System.out.println("Friday");
	break;
case 6:
	System.out.println("Saturday");
	break;
case 7:
	System.out.println("Sunday");
	break;
default:
	System.out.println("Not such a day ");
	break;
}
	}

}
