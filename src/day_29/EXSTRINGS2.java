package day_29;

public class EXSTRINGS2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcdefghijklmnop";
		String res="";
		for(int i=0; i<str.length(); i++) {
			res+=str.charAt(i)+str.charAt(i);
		}
System.out.println(res);
	}

}
