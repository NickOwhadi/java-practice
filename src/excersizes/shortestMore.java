package excersizes;

import java.util.*;

public class shortestMore {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] arr = str.split(", ");
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		String shortest = arr[0];
		shortest = arr[0];

		for (int i = 0; i < arr.length - 1; i++) {
			if (shortest.length() > arr[i].length()) {
				shortest = arr[i];
			}
		}
		
		String result="";
		for (int i=0; i<arr.length-1; i++) {
			if(shortest.length()==arr[i].length()) {
			result+=arr[i]+" ";
				
			}
			
	  }
	    
		String []finalShortests=result.split(" ");
	  System.out.println(Arrays.toString(finalShortests));
		
		
	}
}
