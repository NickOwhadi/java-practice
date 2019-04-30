package day18_loopWhile;

public class Alfabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char letter = 'a';
        while(letter<='z') {
        	System.out.print(letter+" ");
        	letter++;
        
        }
        System.out.println();
        char capitals ='A';
        while (capitals<='Z') {
        	System.out.print(capitals+ " ");
        	capitals++;
        }
        System.out.println();
        char reletter = 'z';
        while(reletter >='a') {
        	System.out.print(reletter + " ");
        	reletter--;
        }
        String letters ="";
        letters = letters +'A';
        
        
	}

}
