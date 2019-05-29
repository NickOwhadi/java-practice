package day_36;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> languages= new  ArrayList<>();
		languages.add("java");
		languages.add("English");
		languages.add("Spanish");
		languages.add("Arabic");
		languages.add("Russian");
		languages.add("Azerbaijani");
		languages.add("Ukranian");
		System.out.println("Number of languages: "+languages.size());
		
		languages.add("Turkish");
		System.out.println("Number of languages: "+languages.size());
		languages.remove(0);
		System.out.println("Number of languages: "+languages.size());
		
		System.out.println(languages.toString());
		
		
		

	}

}
