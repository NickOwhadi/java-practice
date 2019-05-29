package day_29;
import java.util.*;
public class Array2DConvertion {
	  public static  double convertC(String[][] money,String[][] convertionRate) 
	  {
		  double result=0;
		  for(int i=0; i<money.length-1; i++) {
result+=(Double.parseDouble(money[i][1]))*(Double.parseDouble(convertionRate[i][1]));
		  }
	    
	  
	  return result;
	  
	  }
	  
	    public static void main(String[] args) 
	   {
	     
	     
	     
	     String[][] test_money =
	     {
	       {"mark","5"},
	       {"shekel","30.5"},
	     };
	     
	     String[][] test_convert=
	     {
	       {"mark","1"},
	       {"shekel","0.5"},
	     };
	     
	     double res =Array2DConvertion.convertC(test_money,test_convert);
	     System.out.print(res);
	     
	   }

	  
	}