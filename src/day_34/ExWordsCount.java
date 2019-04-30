package day_34;

public class ExWordsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(wordCount("java is fun"));
	}
	public static int wordCount(String words) {
	    String[] result=words.split(" ");
	    return result.length;
	      
	  }

}
