package excersizes;
import java.util.*;
public class Switchtoleft {

	 public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    int size = scan.nextInt();
		    int[] nums = new int[size];
		    for(int i = 0; i < size; i++){
		      nums[i] = scan.nextInt();
		    }
		    //WRITE YOUR CODE HERE
		    for(int i=0; i<size-1; i++){
		      
		      if(nums[i]>=nums[size-2]){
		    	  nums[i]=nums[i+1];
		        
		      }else {
		    	  nums[size-1]=nums[i];
		      }
		    }
		    
		System.out.println(Arrays.toString(nums));
		  }
		}
