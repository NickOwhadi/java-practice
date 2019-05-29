package day37_ArrayListVSArray;

import java.util.ArrayList;

public class shoppingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> shoppingList= new  ArrayList<>();
		shoppingList.add("paper Towel");
		shoppingList.add("dish soap");
		shoppingList.add("socks");
		shoppingList.add("trash bag");
		shoppingList.add("colorox");
		shoppingList.add("gloves");
		shoppingList.add("shovel");
		int count=shoppingList.size();
		
		System.out.println("Total count: "+count);
		System.out.println(shoppingList.toString());
		System.out.println(shoppingList.get(0)+ "|"+shoppingList.get(count-1));

		shoppingList.remove("paper Towel");
		shoppingList.remove("shovel");
		shoppingList.remove(0);
		System.out.println(shoppingList);
		
		for(String item: shoppingList) {
			System.out.println(item);
		}
		shoppingList.clear();
		System.out.println(shoppingList);
		
		
		
	}

}
