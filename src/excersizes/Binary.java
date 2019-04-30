package excersizes;

import java.util.Arrays;

public class Binary {

	public static void main(String[] args) {
		
		int input = 15;

	    int [] bits = new int [8];
	    for (int i = 7; i >= 0; i--) {
	        bits[i] =(input%2) ;
	        input=input/2;
	    }

	    System.out.println(Arrays.toString(bits));
	}
}