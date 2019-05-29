package day52_Inheritance06;

import java.util.Arrays;

public class FinalArrays {
	public static void main(String[] args) {
	final int[] TEAMS= {11,11};
	System.out.println(TEAMS[0]);
	System.out.println(TEAMS[1]);
	
	TEAMS[0]=10;
	TEAMS[1]=9;
	
	System.out.println(TEAMS[0]);
	System.out.println(TEAMS[1]);
	
	final int[]finalNums= {23,66,44,11};
	System.out.println(Arrays.toString(finalNums));
	
	final double  []PRICES=new double[3];
	PRICES[0]=85.5;
	PRICES[1]=81.5;
	PRICES[2]=99.5;
	
	System.out.println(Arrays.toString(PRICES));
	}
	
	

}
