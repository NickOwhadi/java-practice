package day14_string_manipolation;

public class charAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String word = "Computer";
System.out.println(word.charAt(0));
System.out.println(word.charAt(1));
System.out.println(word.charAt(2));
System.out.println(word.charAt(3));
System.out.println(word.charAt(4));
System.out.println(word.charAt(5));
System.out.println(word.charAt(6));
System.out.println(word.charAt(7));
//System.out.println(word.charAt(8));
String sentence = "Java";
if (sentence.charAt(0) == 'J') {
	System.out.println("J is the first char");
}else {
	System.out.println("J is not th first");
}
	String word3 = "civic";
	char first = word3.charAt(0);
	char last = word3.charAt(4);
	if(first == last) {
		System.out.println("yes");
	}else {
		System.out.println("not");
	}
		String word4 = "wlijiwjjfrwrjqw";
		char lastChar = word4.charAt(word4.length()-1);
		System.out.println("Last char of"+word4+"  is "+lastChar);
}
	
	
	
}



