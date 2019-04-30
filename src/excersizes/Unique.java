package excersizes;
import java.util.*;
public class Unique {

	  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    int nums[] = { 11, 2, 3, 1, 6, 2, 5, 8, 3, 2, 8, 4 ,5};
		    Arrays.sort(nums);
	System.out.println(Arrays.toString(nums));	  
		    for (int j = 0; j < nums.length; j++) {
		        if(j==0) {
		            if(nums[j]!=nums[j+1]) {
		                System.out.println(nums[j]);
		            }
		        }else
		        if(j==nums.length-1) {
		            if(nums[j]!=nums[j-1]) {
		                System.out.println(nums[j]);
		            }
		        }else
		        if(nums[j]!=nums[j+1] && nums[j]!=nums[j-1]) {
		            System.out.println(nums[j]);
		        }
		    }
	  }
}