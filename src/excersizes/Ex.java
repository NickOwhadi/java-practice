package excersizes;
import java.util.Scanner;
public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String finale="";
		    Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    String separator = scan.next();
		    int count = scan.nextInt();
		    finale=word;
		    for (int i = 1; i<count; i++){
		      
		       finale+=separator+word;
		      
		    }
		    
		    System.out.println(finale);
		  }
		}
	


