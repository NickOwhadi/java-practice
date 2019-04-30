package day_34;

import java.util.Arrays;

public class ExClean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(clean("he said bla bla bla","bla"));

	}
	public static String clean (String text ,String badWord) {
		String[] textArr=text.split(" ");
		
		String result="";
		for(int i=0; i<textArr.length; i++) {
			if (!textArr[i].equals(badWord)) {
				result+=textArr[i]+ " ";
				
					
			}	
		}
	    result=result.trim();
	    return result;
	  }
	}