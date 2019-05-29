package excersizes;

public class ExtractNumbersStrig {
	public static void main(String[] args) {
		System.out.println(extractNum("aa!!%$#.10aa"));
		
	}
	
	
	 public static String extractNum(String s) {
		    String extracted="";
		    for(int i=0; i<s.length(); i++) {
		    	if(Character.isDigit(s.charAt(i))) {
		    		extracted+=s.charAt(i);
		    	}
		    }
		  return extracted; 
	  }
	
}
