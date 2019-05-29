package day52_Inheritance06;

public class EqualsMethod {
	public static void main(String[] args) {
		Computer comp1=new Computer("iMac","Silver");
		Computer comp2=new Computer("iMac","Silver");
		Computer comp3=comp2;
		
		System.out.println(comp1==comp2);
		System.out.println(comp1.equals(comp2));
		
		System.out.println(comp3==comp2);
		System.out.println(comp3.equals(comp2));
		
		
		String str1="java";
		String str2=new String ("java");
		System.out.println(str1==str2);
		System.out.println(str1.contentEquals(str2));
		
		
	}

}
