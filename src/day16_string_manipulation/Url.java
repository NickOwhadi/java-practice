package day16_string_manipulation;
import java.util.*;
public class Url {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("please enter your url");
String url = scan.next();
if (url.startsWith("www.")) {
	System.out.println("www. it there ");
}
else {
	System.out.println("not");

return;
}

if(url.charAt(url.length()-4)  =='.') {
	
	System.out.println("it is there before extension");
}else {
	System.out.println("might be replaced");
}
String domain=url.substring(4,(url.length()-4));
System.out.println("domain: "+domain);
String extension=url.substring(url.length()-3, url.length());
System.out.println("extension: "+extension);
	}

}

