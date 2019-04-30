package day24_array;

public class SplitSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
     String sentence= "Java is a general-purpose computer-programming " 
    		 +"language that is concurrent, class-based, object-oriented," 
    		+" and specifically designed to have as few implementation " 
    		 +"dependencies as possible.";
     String[]words = sentence.split(" ");
     for (String str: words) {
    	 if (str.contentEquals("language")) {
    		 break;
    	 }
    	 counter++;
     }
     System.out.println("Position: "+counter);
     System.out.println(words[counter]);
	}

}
