package day27_main;

import java.util.Arrays;

public class Arraysclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] nums = {43,12,4,1,3,5};
    //toString method
    String str = Arrays.toString(nums);
    //toString method exist in each  and every class
    System.out.println(str);
    //sort method sorts array in ascending order
    Arrays.sort(nums);
    System.out.println(Arrays.toString(nums));
    String []languages = {"Zulu","Spanish","Italian","English"};
    Arrays.sort(languages);
    System.out.println(Arrays.toString(languages));
    //orders numbers< uppercase<lowercase(ASCII Value)
    
    int[] nums2 = {345,665,3333,11,3,66};
    Arrays.sort(nums2);
    System.out.println(Arrays.toString(nums2));
    int lowest=nums2[0];
    int largest=nums2[nums2.length-1];
    System.out.println(lowest+", "+largest);
    int nums3[]= {4, 10, 20, 50};
    Arrays.binarySearch(nums3, 10);
    
    
	}
}
