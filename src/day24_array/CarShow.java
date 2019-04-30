package day24_array;

import java.util.Arrays;

public class CarShow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String []cars= {"BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla"};
     for(String c: cars) {
    	 if(!c.startsWith("M")) {
    		 continue;
    	 }
    	 System.out.println(c);
    	 System.out.println();
     }
     for(String c: cars) {
    	 if(c.contains("r")) {
    		 System.out.println(c);
    	 }
    	 
        	 }
     for(String c: cars) {
    	 if(!c.endsWith("a")) {
    		 continue;
     }
    	 System.out.println(c);
	}
     for(String c: cars) {
    	 if(c.length()>=6) {
    		 System.out.println(c);
     }
     }
     String temp = cars[0];
     cars[0]= cars[cars.length-1];
     cars[cars.length-1]=temp;
     System.out.println(Arrays.toString(cars));
     Arrays.sort(cars);
     System.out.println(Arrays.toString(cars));
     }
	}

