package excersizes;
import java.util.*;
public class ArrayListAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(notString("x"));
	}
	public static String notString(String str) {
		  if(str.startsWith("not")) {
			 str=str; 
		}else {
			str="not"+str;
		}
return str;
}
}