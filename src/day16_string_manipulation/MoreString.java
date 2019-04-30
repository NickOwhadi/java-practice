package day16_string_manipulation;

public class MoreString {
public static void main(String[] args) {
	String sentence = "I wrote [12] lines of cod today";
	int start = sentence.indexOf('[')+1;
	int end = sentence.indexOf(']',start);
	String codeCount =sentence.substring(start, end);
	System.out.println("Lines of code:" + codeCount);
	System.out.println("Lines of code: " + sentence.substring(sentence.indexOf('[')+1,sentence.indexOf(']')));
	int count = Integer.parseInt(codeCount);
	if(count>20) {
		System.out.println("Wrote more than 20 lines of code today!!!!!");
	}else {
		System.out.println("Not enough coding");
	}
}
}
