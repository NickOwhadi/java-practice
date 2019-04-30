package day27_main;

import java.util.*;

public class CopyArrayWholeOrSome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] d1 = { 2.3, 4.5, 12.4 };
		double[] d2 = d1;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		d1[0] = 1000.2;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		d2[1] = 4000.5;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		
		
		double []d3 = Arrays.copyOf(d2, d2.length);
		d1[2]=34.76;
		
		System.out.println(Arrays.toString(d1));
		System.out.println("d3: "+Arrays.toString(d3));
	}

}
