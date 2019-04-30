package day_34;

import java.util.*;

public class MethodArrayReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(getArray()));
		int[] nums = getArray();
		System.out.println(Arrays.toString(nums));
//for(;;){
		System.out.println(Arrays.toString(getRandomArray(20)));
		int[] randomNums = getRandomArray(3);
		System.out.println(Arrays.toString(randomNums));

	}

	public static int[] getArray() {
		int[] retArray = { 45, 43, 11, 545, 1000 };
		return retArray;

	}

	public static int[] getRandomArray(int size) {

		Random rand = new Random();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = rand.nextInt(101);
		}
		return nums;
	}
}
