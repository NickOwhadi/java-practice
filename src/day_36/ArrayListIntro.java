package day_36;
import java.util.ArrayList;
public class ArrayListIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names=new ArrayList<>();
		ArrayList<Integer> nums=new ArrayList<>();
		
		names.add("Roman");
		names.add("Orhan");
		names.add("Vlad");
		names.add("Olimjon");
		names.add("Natalia");
		
		nums.add(100);
		nums.add(15);
		nums.add(234);
		//read from ArrayList
		
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		
		System.out.println("Names Count: "+names.size());
		System.out.println("Nums count: "+nums.size());
		
		
		
		
		
		

	}

}
