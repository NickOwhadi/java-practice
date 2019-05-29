package day37_ArrayListVSArray;
import java.util.*;
public class ArrayAsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<String> cars=new ArrayList<>();
	cars.add("Honda");
	List<Integer> nums=Arrays.asList(4,2,5,7,8);
	System.out.println(nums.size());
	System.out.println(nums.toString());
	ArrayList<Double> prices=new ArrayList<>(10);
	prices.add(12.4);
	prices.add(5.3);
	prices.add(500.0);
	prices.add(1230.50);
	prices.add(5.99);
	prices.add(12.0);
	prices.add(9874.44);
	prices.add(34.4);
	prices.add(123.5);
	prices.add(7.3);
	System.out.println(prices);
	double sum=0;
	for(double price:prices) {
		sum+=price;
	}
	System.out.println("Sum: "+sum);
	double sum1=0;
	ArrayList<Double> expensive=new ArrayList<>();
	for(int i=0; i<prices.size(); i++) {
		sum1+=prices.get(i);
		if(prices.get(i)>100) {
			expensive.add(prices.get(i));
		}
	}
	System.out.println("Sum1: "+sum1);
	System.out.println(expensive);
	prices.removeAll(expensive);
	System.out.println(prices);
	
	
	}

}
