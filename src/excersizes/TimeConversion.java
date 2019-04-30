package excersizes;

import java.util.*;

public class TimeConversion {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		timeConversion(scan.nextLine());
	}

	 public static void timeConversion(String s) {
		    /*
				 * Write your code here.
				 */
if(s.length()==9) {
	s="0"+s;
}
		 boolean ampm = (s.endsWith("AM"));
			int hour = Integer.parseInt(s.substring(0, 2));
			if(ampm){
				if(hour == 12){
					System.out.println("00" + s.substring(2, 8));
				}
				else
					System.out.println(s.substring(0, 8));  
			} 
			else{
				if(hour != 12)
					hour += 12;
				System.out.println(hour + s.substring(2, 8));
			}
		}
	 
	}