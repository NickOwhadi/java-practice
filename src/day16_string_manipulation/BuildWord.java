package day16_string_manipulation;

public class BuildWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chars = "{{}}";
		String word = "java";
		String result =chars.substring(0,2)+word+chars.substring(2);
		System.out.println(result);
		
	}

}
