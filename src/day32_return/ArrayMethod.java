package day32_return;

import java.util.Arrays;

public class ArrayMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] myArray = { 44, 22, 66, 11};
printArray(myArray);
printArray(new int[] {33, 45, 5, 7});
printArray(new int[] {3,4,5,6,7,8,9,3,42,45,66,44,77,33});
int []myNums=new int[] {3,5,6,78,4};
printArray(myNums);

	}
	public static void printArray(int []nums) {
		//System.out.println(Arrays.toString(nums));
		for(int n: nums) {
		System.out.print(n+" ");
		}
		System.out.println();
	}
	
	

}
