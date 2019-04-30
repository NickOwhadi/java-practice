package day24_array;

public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String [] cities = { "Washington D.C.","Kiev","Annandale", "Moscow",
        		"Istanbul","Baku","Miami","Silver Spring","Mclean"};
        System.out.println(cities.length);
        for (int i = 0; i<cities.length; i++) {
        	if(cities[i].startsWith("M")) {
        		System.out.println(cities[i]);
        	}
        }
        for(String city: cities) {
        	if(city.startsWith("M")) {
        		System.out.print(city+" ");
        	}
	}
        }
}
