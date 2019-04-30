package day8_FlowControl;
import java.util.*;
public class gradeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*A, B, C, D
		 char grade = scan.next().charAt(0);
		 if grade is 'A' => 
		 		Excellent Job! Keep it up!
		 else
		 	how many points did you miss for 'A'?
		 	int points = scanner
		 	print "Your grade B is not good enough."
		 		  "You could earn 10 more points if you studied harder."
        */
		System.out.println("### START PROGRAM ###");
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is you grade?");
		char grade = keyboard.next().charAt(0);
		
		if(grade == 'A') {
			System.out.println("Excellent Job, Keep it up!");
		}else {
			System.out.println("Your grade "+grade+" is not good enough.");
			System.out.println("How many point did you miss for \'A\'?");
		
		int rest = keyboard.nextInt();
		System.out.println("You could earn " + rest + " more points if you studied harder.");
	}

		System.out.println("#### END OF PROGRAM ####");

	}
}
