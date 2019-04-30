package day15_string_manipulations;

public class contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String word = "Bananas";
   if( word.contains("a")) {
	   System.out.println("haha");
	   String email = "test@gmail.com";
	   System.out.println(email.contains("@"));
	   String list = "potatoes, apples, tomatoes, eggs, milk, beread";
	   if(list.contains("apples")) {
		   System.out.println("apples are there");
	   }else {
		   System.out.println("let's add apples now!");
	   }
   
  boolean hasEggs = list.contains("eggs");
  System.out.println("Contains eggs:" +hasEggs);
  boolean hasCucumbers = list.toLowerCase().contains("cucumbers");
  System.out.println("Contains Cucumbers"+hasCucumbers);
  email = "name@yahoo.com";
  if (email.contains("@yahoo")) {
	  System.out.println("it is yahoo email");
  }else if (email.contains("@goolge")) {
	  System.out.println("it is gmail email");
  } 
  String etsyTitle = "wooden spoon | Etsy";
	if(etsyTitle.contains(" | ")) {
		System.out.println("Pipes is there");
	}
  String name = "Nick";
  if(name.contains("a") || name.contains("e")) {
	  System.out.println("a and e are there");
  }else {
	  System.out.println("a or e are not there");
  }
	}
	}
}
