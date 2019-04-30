package excersizes;
import java.util.*;
public class MultiplactionTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TODO: type your code below
		int [][] multiplicationTable = new int[10][10];
	    for (int i=0; i<10; i++) {
	    	for(int j=0; j<10; j++) {
	    		multiplicationTable[i][j]=(i+1)*(j+1);
	    		
	    	}
	    	
	    }
	    
	    //Do not modify below line it will be used to test your code. And 
	    //Can be used by you while developing your code
	   
		System.out.println(Arrays.deepToString(multiplicationTable)+"\n");
		
	}
	
}
