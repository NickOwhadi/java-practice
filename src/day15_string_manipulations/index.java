package day15_string_manipulations;

public class index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java";
		str.indexOf("j");//0
		str.indexOf("v");//2
		str.indexOf("a");//1
	String word1 = "github";
	System.out.println(word1.indexOf("g"));
	System.out.println(word1.indexOf("th"));
	System.out.println(word1.indexOf("hub"));
	System.out.println(word1.indexOf("java"));
	String url = "www.okta.com";
	int i = url.indexOf(".");
	System.out.println("pos of . is "+ i);
	System.out.println(url.charAt(i+1));
	
	String title = "java - Google Search";
	int dash = title.indexOf("-");
	System.out.println(title.charAt(dash-2));
	System.out.println(title.charAt(dash+2));
	String country = "United States of America";
	int states = country.indexOf("States");
	System.out.println("Position of States:"+ states);
	String word2 = "java, c++, python";
	if(word2.contains("c++")) {
		System.out.println("c++ it is there");
	}else {
		System.out.println("c++ it is not there");
	}
	if(word2.indexOf("c++")>-1) {
		System.out.println("c++ it is there");
	
	}else {
		System.out.println("c++ it is not there");
	}
	
}
}
