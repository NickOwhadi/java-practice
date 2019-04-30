package day26_Arrays;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words = "java,kava,html,selenium";
		String[] wordsArray = words.split(",");
		System.out.println("count: " + wordsArray.length);
		for (String word : wordsArray) {
			System.out.println(word);
		}
		String diceResult = "1 -20 of 1,461 positions";
		String[] results = diceResult.split(" ");
		System.out.println();
		System.out.println(results.length);
		String[] diceArray2 = diceResult.split("of");
		System.out.println(diceArray2[0].trim());
		System.out.println(diceArray2[1].trim());
		System.out.println();

		String sentence = "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy.";
		String[] allWords = sentence.split(" ");

		String[] happySplit = sentence.split("happy");

		String[] ISplit = sentence.split("I");
		for(String a: allWords) {
		System.out.println(a);
		}
		for(String b: happySplit ) {
			System.out.println(b);
			}
		String word ="java";
		char[]charsArray=word.toCharArray();
		for (char ch: charsArray) {
			System.out.println(ch);
		}

	}

}
