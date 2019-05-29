package day39_;
import java.util.*;
public class Warm {
	public static void main(String[] args) {
		
	
	ArrayList<String> cities = new ArrayList<>();
    
    cities.add("Tokyo");
    cities.add("New York");
    cities.add(0,"Paris");
    cities.add("Pittsburgh");
    cities.add(1,"Berlin");
    cities.add("Madrid");
    cities.add("Moscow");
    cities.add("Istanbul");
    cities.add("Washington D.C.");
    cities.add("Amsterdam");
    cities.add("Zurich");
    cities.add("Singapore");
    cities.add("Milan");
    cities.add("Toronto");
    cities.add("London");
    cities.add("Lima");
    System.out.println(cities);
    String res="";
    for(String city:cities) {
    	res+= city+" | ";
    }
    System.out.println(res);
    for(int i=0; i<cities.size(); i++) {
    	res+=cities.get(i)+" | ";
    	
    }
    System.out.println(res);
    System.out.println(cities.toString().toUpperCase());
    
    for(int i=0; i<cities.size(); i++) {
    	
    	cities.set(i,cities.get(i).toUpperCase());
    	
    }
    System.out.println(cities);
    String longestCity="";
    String shortestCity=cities.get(0);
    for(int i=0; i<cities.size(); i++) {
    	if(longestCity.length()<cities.get(i).length()) {
    		longestCity=cities.get(i);
    	}
    	
    }
    System.out.println("Longest city: "+longestCity);
    for(int i=0; i<cities.size(); i++) {
    	if(shortestCity.length()>cities.get(i).length()) {
    		shortestCity=cities.get(i);
    	}
    	
    }
    System.out.println("Shortest City: "+shortestCity);
    
    List<String> citiesMoreThan6 = new ArrayList<>();
    for(int i=0; i<cities.size(); i++) {
    	if(cities.get(i).length()>6) {
    		citiesMoreThan6.add(cities.get(i));
    	}
    }
    System.out.println(citiesMoreThan6);
    
    
    
    
    
    
}
}