package day28_Arrays;

import java.util.*;

public class Multilid_arrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] inhabitants = { 1, 2, 3, 4, 5, 6, 7, 8 };

		// TODO. Write you code below this line.
		
		
		for (int i = 0; i<10; i++) {
			int idx = 0;
			int sum=0;
			
			System.out.println("Day "+i+" "+Arrays.toString(inhabitants));	
			
			sum+= inhabitants[idx];
			System.out.println(sum);
				
			while ( idx < 8 ) {
					
				
				inhabitants[idx] = inhabitants[idx] / 2;
				// System.out.print("Day " + idx + " [" + inhabitants[idx] + "]");
				idx++;
			
				
			}
			
	}

		System.out.println("---- EXTINCT ----");
	}
}