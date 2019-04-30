package day20_LoopDoLoopFor;

public class IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "amazon";
		char letter = 'm';
		int index = -1;
		for (int counter = 0; counter < word.length(); counter++) {
			if (word.charAt(counter) == letter) {
				index = counter;
				break;
			}
		}
		System.out.println("Index: "+ index);
	}

}
