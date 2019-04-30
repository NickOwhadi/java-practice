package day28_Arrays;

import java.util.Arrays;

public class StateCity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][] nums= new int [3][4];
    nums[0][0]=100;
    nums[0][1]=3453;
    nums[0][2]=234;
    nums[0][3]=567;
    nums[1][0]=167;
    nums[1][1]=345;
    nums[1][2]=13534;
    nums[1][3]=1245;
    nums[2][0]=179;
    nums[2][1]=13456;
    nums[2][2]=12345;
    nums[2][3]=1869;
    
    System.out.println(Arrays.deepToString(nums));
    System.out.println(Arrays.toString(nums[0]));
    System.out.println(Arrays.toString(nums[1]));
    System.out.println(Arrays.toString(nums[2]));
    int[][] scores = { {3,5,10},{6,4,2,10} };
    
    System.out.println("Days played/Number of arrays:"+scores.length);
    System.out.println("Number of values in 1:"+scores[0].length);
    System.out.println("Number of values in 2:"+scores[1].length);
    
    int[][] values=new int[4][];
    values[0] = new int[] {34, 23, 5};
    values[1] = new int[] {34,56,33,11,23,33,77,2};
    values[2]= new int[2];
    values[2][0]=55;
    values[2][1]=34;
    
    values[3]= new int[] {5,3,6,7,33,88,34};
    System.out.println(Arrays.deepToString(values));
    
	}

}
