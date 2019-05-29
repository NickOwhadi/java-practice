package excersizes;
import java.util.*;
public class ReplItArrayListIntegerSum {
public static void main(String[] args) {
	ArrayList <Integer> my1=new ArrayList <>();
	my1.add(-13);
	my1.add(1232);
	my1.add(8);
	System.out.println(appendPosSum(my1));
}
	public static ArrayList <Integer> appendPosSum(ArrayList<Integer> nums1){
		int sum=0;
		ArrayList<Integer> nums2 = new ArrayList<>();
		for(Integer n: nums1) {
			if(n>=0) {
				nums2.add(n);
				sum+=n;
			}
		}
		nums2.add(sum);
		return nums2;
	}
}

