package day49_Inheritance;
import java.util.*;
public class Fuel {
	 public static int refuel_times(ArrayList<Integer> deliveries,int max_fuel) 
	  {int time=0;
	  int total=0;
	    for(int del:deliveries) {
	    	total+=del;
	    }
	    if(total%max_fuel>0) {
	    	time=total/max_fuel+1;
	    }else
	    	time=total/max_fuel;
	   
	  return time;
	  }
	  
	  public static void main(String[] args)
	  {
	    
	    ArrayList<Integer>  arr = new ArrayList<>();
	    arr.add(3);
	    arr.add(3);
	    arr.add(1);
	    arr.add(2);
	    arr.add(6);
	    int times = refuel_times(arr,3);
	    System.out.print(times);//should output 5
	    
	     
	   
	    
	  }//end main
}
