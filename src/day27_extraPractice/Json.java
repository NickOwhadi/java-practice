package day27_extraPractice;
import java.util.*;
public class Json {

	 public static void main(String[] args) {
		    System.out.println("-----EXAMPLE RUN ---------");
		    String[] numbers = {"zero", "one", "two","three","four", "six","seven"};
		    System.out.println(Arrays.toString(getWithE(numbers)));
		    
		  }
		  
		  
		  
		  public static String[] getWithE(String[] arr) {
			
		    
		    //TODO : YOUR CODE GOES HERE ----------------------
			  int count=0;
			  
			for (String ar: arr) {
				if(ar.contains("e")) {
				count++;
				
				}
				}
				String [] fewValues=new String[count];
				
			int counter=0;
			for (int i=0; i<arr.length; i++) {
				if(arr[i].contains("e")) {
				
					fewValues[counter++]=arr[i];
				}
				
		  }
		    //YOUR CODE ENDS HERE -----------------------
		  return fewValues; 
		   
		  }
		  

			}	  
		
		