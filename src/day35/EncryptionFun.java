package day35;
import java.util.*;
public class EncryptionFun {

	public static void main(String[] args) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		
		String word = "civic";
		
		//get a char from word
		//find indexOf the char in alphabet
		//read the char from encrypted at that index
		//add to some string
		char first = word.charAt(0); // 'e'
		int position = alphabet.indexOf(first);
		System.out.println("position: " + position);
		char enChar = encrypted.charAt(position);
		System.out.println(first + " --> " + enChar);
		
		//with a loop
		String encryptedWord = "";
		for(int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			//find in alphabet
			int index = alphabet.indexOf(ch);
			//System.out.print(encrypted.charAt(index));
			encryptedWord+=encrypted.charAt(index);
			System.out.println(encryptChar('m'));
		}
		
		System.out.println(word);
		System.out.println(encryptedWord);
		String normal="html";
		String encryptted=encryptWord(normal);
		System.out.println("Normal: "+ normal+"\n"+
		"Encrypted: "+encryptted);
		
		
	}
	public static char encryptChar(char ch) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		int position = alphabet.indexOf(ch);
		char enChar = encrypted.charAt(position);
		return enChar;
		
	}
	
	public static String encryptWord(String word) {
		String cyphered = "";
		for(int i = 0; i < word.length(); i++) {
			cyphered+=encryptChar(word.charAt(i));
		}
		return cyphered;
			
	}
	
	
	
	
	
	
	
}
