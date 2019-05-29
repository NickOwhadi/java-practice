package exCodingBath;

public class MethodPalindrome {
public static void main(String[] args) {
	 System.out.println(isPalindrome("nurses runs"));
}	
	public static boolean isPalindrome(String check) {
		check=check.replaceAll(" ", "");
		String reverse="";
		for(int i=check.length()-1; i>=0; i--) {
			reverse+=check.charAt(i);
		}
		boolean isThere;
		if(reverse.equalsIgnoreCase(check)) {
			isThere=true;
		}else 
			isThere=false;
		
		
		
		
		return isThere;
	}

}
