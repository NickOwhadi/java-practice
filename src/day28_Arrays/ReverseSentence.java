package day28_Arrays;

import java.util.Arrays;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence="you are very interesting person";
		String[]arr=sentence.split(" ");
		System.out.println(Arrays.toString(arr));
		String reverse="";
		for(int i=arr.length-1; i>=0; i--) {
			reverse+=arr[i]+ " ";
			
		}
		reverse = reverse.trim();
		System.out.println(reverse);
	}

}
