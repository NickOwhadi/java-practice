package day_38ArrayList;
import java.util.*;
public class CoolectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numsList= new ArrayList<>();
		numsList.add(44);
		numsList.add(1);
		numsList.add(3);
		numsList.add(4);
		numsList.add(1000);
		System.out.println(numsList);
		Collections.sort(numsList);
		System.out.println(numsList);
		
		
		List<String> strList= new ArrayList<>();
		strList.add("Fuad");
		strList.add("Roman");
		strList.add("Murad");
		strList.add("Muhabbat");
		strList.add("Maria");
		System.out.println(strList);
		Collections.sort(strList);
		System.out.println(strList);
		int maxNum=Collections.max(numsList);
		int minNum=Collections.min(numsList);
		String maxName=Collections.max(strList);
		String minName=Collections.min(strList);
		System.out.println(maxNum);
		System.out.println(minNum);
		System.out.println(maxName);
		System.out.println(minName);
		Collections.shuffle(strList);
		System.out.println(strList);
		Collections.shuffle(strList);
		System.out.println(strList);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
}