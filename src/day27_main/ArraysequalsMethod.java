package day27_main;

import java.util.Arrays;

public class ArraysequalsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {4,5,6,10,100};
		int[] nums2 = {4,5,6,10,100};
		System.out.println(Arrays.equals(nums1, nums2));
		if(Arrays.equals(nums1, nums2)) {
			System.out.println("They are exactly same");
		}else {
			System.out.println("Mismatched values presents");
		}
			String []strArr1 = {"one", "two", "three"};
			String []strArr2 = {"One", "two", "three"};
			boolean match = Arrays.equals(strArr1, strArr2);
			System.out.println("Match:"+match);
			
			
		
	}

}
