package day20_LoopDoLoopFor;

import java.util.*;

public class Zamby2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] inhabitants = {3, 6, 0, 4, 3, 2, 7, 0};                //new int[8];
		//for (int i = 0; i < inhabitants.length; i++) {
			//inhabitants[i] = input.nextInt();
			// 3, 6, 0, 4, 3, 2, 7, 0
		//}
		// TODO. Write you code below this line.
		
		int sum1 = 0;
		
		for (int i = 0; i < 20; i++) {

			int sum = 0;
			
			System.out.println("Day " + i + " " + Arrays.toString(inhabitants));
			for (int idx = 0; idx < 8; idx++) {
				
				
				sum = sum + inhabitants[idx];
				if (inhabitants[idx] == 0) {
					if (idx == 7 ) {
						inhabitants[idx - 1] = inhabitants[idx - 1] / 2;
						
						
					}
					if (idx == 0 ) {
						inhabitants[idx + 1] = inhabitants[idx + 1] / 2;
						
					}
					if (idx > 0 && idx < 7  ) {

						inhabitants[idx - 1] = inhabitants[idx - 1] / 2;
						
						inhabitants[idx + 1] = inhabitants[idx + 1] / 2;
						idx=idx+1;
					}
              
					
					
				}
				
			}
			
			sum1 = sum;
			if (sum1 == 0) {
				break;
			}
			
		}
		
		System.out.println("---- EXTINCT ----");
		
	}
}