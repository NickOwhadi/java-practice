package excersizes;

public class GearsCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(mergeStrings("wooden", "spoooooon"));
	}
	public static String mergeStrings(String one, String two) {
	 String output="";
	 if(one.length()>=two.length()) {
		 for(int i=0; i<two.length(); i++) {
			 output=output+one.charAt(i)+two.charAt(i);
		 }
		 output=output+one.substring(two.length());
	 }else {
		 for(int i=0; i<one.length(); i++) {
			 output=output+one.charAt(i)+two.charAt(i);
		 }
		 output=output+two.substring(one.length());
	 }
	 
	return output;	 
	    
	    
	  }

}
