package excersizes;
import java.util.*;
public class TxtNoLastT {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
    
    //your code here
    System.out.println("enter");
    String txt = s.next();
    String end = txt.charAt(txt.length()-1) + "";
    System.out.println(end);
    String txt1 =txt.replace(end ,"");
    System.out.println(txt1);
}
}
