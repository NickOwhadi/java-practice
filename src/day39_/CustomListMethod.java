package day39_;
import java.util.*;
public class CustomListMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numsList=new ArrayList<>();
		numsList.add(10);numsList.add(10);numsList.add(7);numsList.add(8);
		numsList.add(8);numsList.add(3);numsList.add(4);numsList.add(8);
		
		printList(numsList);
		
		List<Double> doubleList = new ArrayList<>();
		doubleList.add(10.33);
		doubleList.add(10.22);
		doubleList.add(7.34);
		doubleList.add(8.99);
		doubleList.add(8.12);
		doubleList.add(3.55);
		doubleList.add(4.76);
		doubleList.add(8.08);
		System.out.println(sumList(doubleList));
		
		System.out.println(getList(10));
		ArrayList<Integer> list=getList(15);
		System.out.println(list);
		System.out.println(getRandomList(30));
		List<Integer> ourList=getRandomList(10);
		Collections.sort(ourList);
		System.out.println(ourList);
		printList(getRandomList(7));
		System.out.println();
		List<String> strNums=new ArrayList<>();
		strNums.add("123");
		strNums.add("33");
		strNums.add("128");strNums.add("3");
		List<Integer> converted=convertToIntList(strNums);
		System.out.println(converted);
		
	}
	public static void printList(ArrayList<Integer> nums) {
		for(Integer n: nums) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
	public static double sumList(List<Double> dList) {
		Double sum=0.0;
		for(Double d: dList) {
			sum+=d;
		}
		return sum;
	}
	public static ArrayList<Integer> getList(int size){
		ArrayList<Integer> newList=new ArrayList <>();
		for (int i=1; i<=size; i++) {
			newList.add(i);
		}
		return newList;
	}
	//getRandomList
	  //// return type: List<Integer>
	   //params: int size
	   //getList(5); => 3,55,12,99,34
	public static ArrayList<Integer> getRandomList(int size){
		Random r=new Random();
	
		ArrayList<Integer> randomNums=new ArrayList <>();
		for (int i=1; i<=size; i++) {
			randomNums.add(r.nextInt(101));
		}
		return randomNums;
	}
	public static List<Integer> convertToIntList(List<String> strlist){
		List<Integer> newList=new ArrayList<>();
		for(String str: strlist) {
			newList.add(Integer.parseInt(str));
			 
		}
		return newList;
	}
	
	

}
