package day24_array;

import java.util.Arrays;

public class LotteryTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int [] lotteryNumbers = {12, 45, 3, 62,42,90};
         System.out.println(Arrays.toString(lotteryNumbers));
         Arrays.sort(lotteryNumbers);
         System.out.println(Arrays.toString(lotteryNumbers));
         //binary search
         
         int index = Arrays.binarySearch(lotteryNumbers, 45);
         System.out.println("Position: "+index);

         System.out.println("Position: ");
         
	}

}
