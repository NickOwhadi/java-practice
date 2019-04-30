package day15_string_manipulations;

public class startendWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String word1 = "eclipse";
     System.out.println(word1.startsWith("e"));
     System.out.println(word1.startsWith("ec"));
     System.out.println(word1.startsWith("eclipse"));
     System.out.println(word1.startsWith("Ec"));
     System.out.println(word1.endsWith("e"));
     System.out.println(word1.endsWith("ipse"));
     System.out.println(word1.endsWith("java"));
     System.out.println(word1.toUpperCase().endsWith("PSE"));
     String name = "Mr. Jackson";
    if(name.startsWith("Mr.")) {
    	System.out.println("Man");
    }else if(name.startsWith("Mrs.")) {
    	System.out.println("Married woman");
    }else if(name.startsWith("Ms.")) {
    	System.out.println("some woman");
    }else if(name.startsWith("Dr.")){
    	System.out.println("Doctor");
    }
    else {
    	System.out.println("invalid");
    }
	}

}
