package day19;
import java.util.*;
public class GuessAndNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan = new Scanner(System.in);
     Random random = new Random();// creat random number
     System.out.println("#####WELCOME TO GUESS NUMBER GAME");
     int guessNumber;
     int secretNumber = random.nextInt(101);
     
     do {
    	 System.out.println("guess a number:");
    	 guessNumber = scan.nextInt();
    	 if(guessNumber<secretNumber) {
    		 System.out.println("too small");
    	 }else if (guessNumber>secretNumber) {
    		 System.out.println("too large");
    	 }
     }while(guessNumber != secretNumber);
     System.out.println("Bingo, Congrats, you won!");
     
	}

}
