package day_34;

import java.util.*;

public class VarArs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printWords("red");
		printWords();
		
		printWords("Blue","Red");
		String [] myPets= {"cat","dog","goat"};
		printWords(myPets);
		
		
		
		
		
		System.out.println(sum(30,20,10));
		int budget = 200;
		if(sum (10,45,110,30)<= budget) {
			System.out.println("within budget");
		}else {
			System.out.println("Broke");
		}
		int total =sum(234, 43, 567, 12, 34, 5);
		System.out.println("Total: "+total);
		
		cook("Burrito Bowl","rice", "beans", "chees");
		shoppingList(1000,"Avvocato toast", "shoes", "Swatch watch watch");
		
	}

	private static void printwords(String string, String string2) {
		// TODO Auto-generated method stub

	}

	public static void printWords(String... words) {
		for (String w : words) {
			System.out.println(w);
			
			
		}
	}
	
	public static int sum(int... nums) {
		int sum=0;
		for(int i: nums) {
		sum+=	i++;
			
		}
		return sum;
	}
	public static void cook(String name, String... ings) {
		System.out.print("food: "+ name);
		System.out.println(Arrays.toString(ings));
	}
	public static void shoppingList (int totalPrice, String... items ) {
		System.out.print("Total cost: " + totalPrice);
		System.out.println(Arrays.toString(items));
	}
	
	
	
	
	
}
