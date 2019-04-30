package day23_array;
import java.util.*;
public class ConcatJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String sum="";
		for(int i =0; i<6; i++) {
			System.out.println("Please eneter your word");
			String word = scan.next();
			//if(word.equals("java")) {
			//	continue;
			//}
			sum += word +" ,";
			sum=sum.replace("java", "");
			sum=sum.replace(" , ", "");
		}
		System.out.println(sum.substring(0, sum.length()-2));
		//System.out.println("All words: " + (allWords.length()
		//> 1 ? allWords.substring(0, allWords.length() - 2) : ""));

	}

}
