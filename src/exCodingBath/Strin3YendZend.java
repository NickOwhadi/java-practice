package exCodingBath;

public class Strin3YendZend {
	public static void main(String[] args) {
		
	
	String str="day fyyyz";
	int count=0;
	str=str.toLowerCase();
	for(int i=1; i<str.length(); i++) {
		if(str.charAt(i)=='y'&&(i==str.length()-1||!Character.isLetterOrDigit(str.charAt(i+1)))) {
		count++;	
		}
		if(str.charAt(i)=='z'&&(i==str.length()-1||!Character.isLetterOrDigit(str.charAt(i+1)))) {
			count++;	
			}
	}
	System.out.println(count);
	}
}