package day24_array;

public class Arraychars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         char[]values= {'a','b','c'};
         for(char value: values) {
        	 System.out.println(value);
         }
	
	String str = "wooden spoon";
	char[]chars = str.toCharArray();//convert string to char
	for(char c: chars) {
		System.out.print(c+" ");
	}
	System.out.println();
	str ="";
	for(int i=chars.length-1; i>=0; i--) {
		
		System.out.print(chars[i]);
	}
	System.out.println();
	for(char c: chars) {
		if(c=='o') {
			System.out.print("*");
		}else {
			System.out.print(c);
		}
	}
	
	
	
	
	
	
	
	
	
	
	}
}
