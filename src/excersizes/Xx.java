package excersizes;
import java.util.Scanner;
public class Xx {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    word=word.replaceFirst("x","");
	    char last=word.charAt(word.length()-1);
	  String last1 =last +"";
	    word=word.replace(last1,"");
	    
	    System.out.println(word);
	  }
	}