package excersizes;
import java.util.*;
public class ReplItMethodAdd2ArrayList {
	public static void main(String[] args) {
		ArrayList<String> myList1=new ArrayList <>();
		ArrayList<String> myList2=new ArrayList <>();
		myList1.add("moon");
		myList1.add("sun");
		myList2.add("neptun");
		myList2.add("pluto");
		System.out.println(combineAL(myList1, myList2));
	}
	
public static ArrayList<String>	combineAL(ArrayList<String> wordList1
		, ArrayList<String> wordList2){
	ArrayList<String> combAl=new ArrayList <>();
	combAl.addAll(wordList1);
	combAl.addAll(wordList2);
	return combAl;
}
	

}
