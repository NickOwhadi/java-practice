package day27_extraPractice;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String word = "java";
    word=word.toUpperCase();
    System.out.println(word);
    
    String word2 = new String("java");
    word2=word2.toUpperCase();
    System.out.println(word==word2);
    System.out.println(word.equals(word2));
	}

}
