package day30_customMethod;
import java.util.*;
public class StudentInsertable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
study("Git");
study("SQL");
timeSleeping(8);
	}
	
	public static void study(String topic) {
		System.out.println("Student is studing "+ topic);
	}
	public static void timeSleeping(int hour) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Students has been sleeping for "+hour+" hours");
	}
	
	

}
