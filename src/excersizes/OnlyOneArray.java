package excersizes;
import java.util.*;
public class OnlyOneArray {


		public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		    
		    //TODO: write your code below
		    int result =0;
		    for (int i=0; i<7; i++){
		      if(result!=nums[i]) {
		    	  result=nums[i];
		      }
		      System.out.println(result);
		    }
		    
		  }
		}
	


