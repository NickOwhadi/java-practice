package day49_Inheritance;

public class Utils {
	 public static String reverseLetters(String word){
			//TODO
		 int len = word.length();
		    char[] revStrArr = new char[len];
		    int j = len-1;
		    for (int i=0; i <= j; ) {
		        if(!Character.isAlphabetic(word.charAt(i))) {
		            revStrArr[i] = word.charAt(i);
		            i++;
		        } else if (!Character.isAlphabetic(word.charAt(j))) {
		            revStrArr[j] = word.charAt(j);
		            j--;
		        } else {
		            revStrArr[j] = word.charAt(i);
		            revStrArr[i] = word.charAt(j);
		            j--;
		            i++;
		        }
		    }

		    return new String(revStrArr);
		}
}