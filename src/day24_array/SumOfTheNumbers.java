package day24_array;

import java.util.Arrays;

public class SumOfTheNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] numbers = new int[3];
        numbers[0]=25;
        numbers[1]=10;
        numbers[2]=20;
        System.out.println(numbers);//hash
        System.out.println(Arrays.toString(numbers));//toString() from Arrats class
        //can help as to print an arrays as string
        int sum =0;
        for(int i = 0; i<numbers.length; i++) {
                sum+= numbers[i];    
        }
        System.out.println("sum: "+sum);
        int max =0;//Integer.MIN_VALUE;
        for (int i = 0; i<numbers.length; i++) {
        	if (numbers[i]>max) {
        		max = numbers[i];
        	}
        }
        System.out.println("Max value: "+max);
        for (int i = 0; i<numbers.length; i++) {
        	if(numbers[i]<max) {
        		max = numbers[i];
        	}
        }
        System.out.println("Min value: "+ max);
	}

}
