package excersizes;
import java.util.*;
public class TxtNoEnd2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter your txt");
	    String txt = s.next();
	    //your code here
	    txt=txt.substring(0,txt.length()-1);
	    System.out.println(txt);
	}

}
