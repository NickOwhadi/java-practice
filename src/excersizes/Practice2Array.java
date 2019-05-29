package excersizes;
import java.util.*;
public class Practice2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[]arr1= {10, 20, 5, 3};
        int[]arr2= {5, 1, 1, 4};
        int[]arr3=  new int[arr1.length];
        for (int i=0; i<arr1.length; i++) {
        	arr3[i]=arr1[i]+arr2[i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        int[]nums1= {20, 40, 15, 33};
        int[]nums2= {52, 13, 15, 45};
        String[]str1= {"20", "40", "15", "33"};
        String[]str2= {"52", "13", "15", "45"};
        
        int[]newArray=add2Arrays(nums1, nums2);
        String[]newstr=add2Arrays(str1, str2);
        System.out.println(Arrays.toString(newstr));
        System.out.println(Arrays.toString(newArray));
        
	}
	public static int[] add2Arrays(int[]nums1, int[]nums2) {
		int[]nums3=  new int[nums1.length];
        for (int i=0; i<nums1.length; i++) {
        	nums3[i]=nums1[i]+nums2[i];
		
	}
return nums3;
}
	public static String[] add2Arrays(String[]str1, String[]str2) {
		String[]str3=  new String[str1.length];
        for (int i=0; i<str1.length; i++) {
        	str3[i]=str1[i]+"-"+str2[i];
		
	}
return str3;
}
	
	
	
}