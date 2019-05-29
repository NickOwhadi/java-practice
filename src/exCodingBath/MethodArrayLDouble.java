package exCodingBath;
import java.util.*;
public class MethodArrayLDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<Integer> myList=new ArrayList<>();
	myList.add(44);
	myList.add(22);
timesTwo(myList);
	}
	public  static void timesTwo(ArrayList<Integer> nums){
		int i=0;
		  for(int num:nums){
			  nums.set(i, num*2);
			  i++;
			  
		  }
		  System.out.println(nums);
		}
}