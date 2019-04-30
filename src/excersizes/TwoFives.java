package excersizes;
import java.util.*;
public class TwoFives {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	    //TODO Type your code below:
	    List list = Arrays.asList(nums);
	    int result;
	    for(int i:nums)
	    {
	        if(list.indexOf(i)==list.lastIndexOf(i))
	        {
	            result = i;
	            System.out.println(result);
	            break;
	             
	        }
	    }
	    		    
	    		  }
	    		}