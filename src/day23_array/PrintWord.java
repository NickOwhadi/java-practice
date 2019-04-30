package day23_array;

public class PrintWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java";
		for(int i =0; i<str.length(); i++) {
			if(str.subSequence(i, i+1).equals("a")) {
				continue;
			}
		System.out.println(str.substring(i, i+1));	
		}
	}

}
