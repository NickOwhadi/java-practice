package day23_array;

public class PrintLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			if(i%2==0) {
			for (char letter = 'a'; letter <= 'z'; letter++) {
				System.out.print(letter);

			}
			}
			System.out.println();
			System.out.println("**************************");
		}
	}
}