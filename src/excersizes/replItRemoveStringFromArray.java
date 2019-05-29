package excersizes;

import java.util.ArrayList;

public abstract class replItRemoveStringFromArray {
	public static void main(String[] args) {
		ArrayList<String> myList1=new ArrayList <>();
		myList1.add("hi");
		myList1.add("hey");
		myList1.add("hi");
		myList1.add("yo");
		myList1.add("hi");
		myList1.add("hi");
		myList1.add("hi");
		myList1.add("hi");
		String s="hi";
		
		removeAll(myList1, s);
	}
	
	
	
	public static   void removeAll(ArrayList<String> wordList
			, String targetWord){
		ArrayList<String> r=new ArrayList <>();
		while(wordList.contains(targetWord)) {
			wordList.remove(targetWord);
		}
		System.out.println(wordList);
	}
}