package day31_customMethod;

import java.util.Arrays;

public class MethodWithString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
countWords("java is fun");
	}
	public static void countWords(String sentence) {
		String[] words=sentence.split(" ");
		System.out.println(Arrays.toString(words));
		System.out.println(words.length+" are Number of words");
	}
	
	
	

}
