package day21_loop;
import java.util.*;
public class TowIntsLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        int sum =0;
       do { System.out.println("enter 2 numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();
        sum = a + b;
        }while(sum<=100);
       System.out.println("Good Numbers");
	}

}
