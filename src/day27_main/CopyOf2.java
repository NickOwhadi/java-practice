package day27_main;
import java.util.*;
public class CopyOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// copy whole nums1 and adding 2 o's value in it
     int[] nums1= {34, 56, 23, 1, 55};
     int[]nums2 = Arrays.copyOf(nums1, nums1.length+2);
     System.out.println(Arrays.toString(nums2));
     nums2[5]=100;
     nums2[6]=200;
     System.out.println(Arrays.toString(nums2));
     int nums3[] =Arrays.copyOfRange(nums1, 1, 4);
     int []brandNew = {34, 23, 54, 23};
     brandNew=Arrays.copyOf(brandNew, brandNew.length +5);
     
     
	}

}
