package day35;

public class ReplaceCrypted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String replace="";
		String word="java";
		for(int i=0; i<word.length(); i++){
		word=word.replace(word.charAt(i), alphabet.charAt((alphabet.length()-1)));
		}
		
		System.out.println(word);
	}
	
}
