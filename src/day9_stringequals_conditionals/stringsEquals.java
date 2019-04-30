package day9_stringequals_conditionals;

public class stringsEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "java";
		String str2 = "java";
		System.out.println(str1 == str2);//true
		System.out.println(str1 == "java");//true
		System.out.println(str2 =="Java");//false
		System.out.println(str1.equals(str2));//true
		System.out.println(str1.equals("java"));//true
		System.out.println(str1.contentEquals("Java"));//false
		//String month = "March";
		String month = new String("March");
		String month2 = new String("March");
		System.out.println(month == month2);
		System.out.println(month.equals(month2));
		System.out.println(month.equals("March"));
	}

}
