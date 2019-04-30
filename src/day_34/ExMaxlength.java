package day_34;

public class ExMaxlength {
	 public static String limit(String text, int maxLength)
	  {
	    String result=text.substring(0, maxLength);
	    return result;
	  }
	  public static void main(String[] args){
	    System.out.println(limit("abcd",2));
	  }
	}

