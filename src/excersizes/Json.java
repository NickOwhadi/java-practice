package excersizes;
import java.util.Scanner;
public class Json {	
	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
			String json = scan.nextLine();

			int x = json.indexOf("lastName");
			int y = json.indexOf("firstName") + 13;
			System.out.println("First name: "+json.substring(y, x - 3).replaceAll("\"", ""));

			int z = json.indexOf("lastName") + 12;
			int c = json.indexOf("role") - 4;

			System.out.println("Last name: "+json.substring(z, c).replaceAll("\"", ""));

	}
}
