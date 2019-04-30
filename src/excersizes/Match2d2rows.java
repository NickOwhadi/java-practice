package excersizes;
import java.util.*;
public class Match2d2rows {
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    int rows = inp.nextInt(), cols = inp.nextInt();
	    int[][] arr = new int[rows][cols];
	    for(int i=0 ;i<=rows-1;i++)
	    {
	      for(int j=0 ;j<=cols-1;j++)
	      {
	        arr[i][j]=inp.nextInt();
	      }//end for cols
	    }//end for rwos
	    
	    //your code here
	    
	    int matches = 0;
	    
			for(int i=0 ;i<rows;i++){
	    
	      for(int j=1 ;j<cols;j++){
	      if(arr[i][j-1]==(arr[i][j])){
	         
	         matches=matches+1;
	        }
	      
	      }
	      
	      
	      
	    }
			
			 
		      	
			System.out.print("matches: "+matches);
	    
	    
	  }//end main
	}
