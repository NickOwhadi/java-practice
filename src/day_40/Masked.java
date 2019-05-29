package day_40;

public class Masked {
	

	/*
	 * maskWord
	 * return: String
	 * params: String word
	 * it will convert each character into * in the work and
	 * return. Length of word and * must match
	 */
	public static String maskWord(String word) {
		String stars ="";
		for(int i = 1; i <= word.length(); i++) {
			stars += "*";
		}
		return stars;
	}
}
