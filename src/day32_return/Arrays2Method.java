package day32_return;

import java.util.Arrays;

public class Arrays2Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] one= {10,2,3};
		int[] two= {3,1,4,545,23,12,34};
print2Arrays(one,two);
print2Arrays(one,two);
	}
	public static void print2Arrays(int [] arrNums1, int[]arrNums2) {
		if(arrNums1.length>arrNums2.length) {
			System.out.println(Arrays.toString(arrNums1));
			System.out.println(Arrays.toString(arrNums2));
			
		}else {
			
			System.out.println(Arrays.toString(arrNums2));
			System.out.println(Arrays.toString(arrNums1));
		}
		
	}
	public static void print2Arrays2(int [] arrNums1, int[]arrNums2) {

		if(arrNums1.length>arrNums2.length) {
			printArray(arrNums1);
			printArray(arrNums2);
			
		}else {
			
			printArray(arrNums2);
			printArray(arrNums1);
		}
		
	}
	public static void printArray(int []nums) {
		//System.out.println(Arrays.toString(nums));
		for(int n: nums) {
		System.out.print(n+" ");
		}
		System.out.println();
	}

}
