package day15_string_manipulations;

public class googleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String item = "java";
    String pageTitle = item+" - Goolge Search - ";
    if (pageTitle.startsWith(item)) {
    	System.out.println("Title checked: passed");
    }
    else {
    	System.out.println("Fail: page title faied");
    	if(pageTitle.endsWith("Google Search")) {
    		System.out.println("Passed");
    	}
    	else {
    		System.out.println("Java said funny");
    	}
    }
    
	}

}
