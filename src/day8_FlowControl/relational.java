package day8_FlowControl;

public class relational {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d1 = 23.56;
		double d2 = 20.43;
		System.out.println(d1 >= d2);
		boolean check = d1 >= d2;
		System.out.println("Check: " + check);
		char ch1 = 'a';
		char ch2 = 'j';
		char ch3 = 'A';
		System.out.println(ch2 > ch1);
		System.out.println(ch1 > ch3);// 'a' is greater than 'A'.b
		boolean b = true == false;
		System.out.println("B: "+ b);
		b = true != false;
		System.out.println("b is:"+ b);
		
	}

}
