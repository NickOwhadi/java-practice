package excersizes;

public class UniqeReplIt {
	public static void main(String[] args) {
	    //test your code
	    System.out.println( uniqueChars("wooden-spoon") ) ;
	  }
	  
	  public static String uniqueChars(String str) {
	    //TODO: write your below
		  String strUnique="";
	    for (int i=0; i<str.length(); i++) {
	    	if(!strUnique.contains(str.substring(i,i+1))) {
	    		strUnique=strUnique+str.charAt(i);
	    	}
	    }
	    return strUnique;
	  }
	}
