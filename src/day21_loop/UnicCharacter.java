package day21_loop;

public class UnicCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String unique = "";
    String word ="java";
    int counter = 0;
    char ch = word.charAt(0);
   
    while (!unique.contains(""+ch) && ch<word.length() ) {
    
    unique += ch;//unique = unique + ch
    	ch++;
	}
    System.out.println(unique);
    
    
    int i = 0;
    String word2 = "bananas";
    String unique2 = "";
    char ch2 = word2.charAt(i);
    System.out.println("ch2:"+ ch2);
    i++;
	}

}
