package excersizes;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[4];
		ArrayList<Integer> nums2 = new ArrayList<>();
		nums2.add(23);
		System.out.println(Arrays.toString(nums));
		System.out.println(nums2);
		System.out.println(nums2.size());
		nums2.add(100);
		nums2.add(123);
		nums2.add(600);
		nums2.add(2, 65);
		System.out.println(nums2);
		Integer numToDelete=600;
		
		nums2.remove(numToDelete);
		System.out.println(nums2);
	}

}
