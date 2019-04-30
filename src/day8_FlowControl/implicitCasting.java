package day8_FlowControl;

public class implicitCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//automatic casting from smaller to larger
		short shortValue = 3455;
		int intValue = shortValue;
		//int (int) optional
		System.out.println("int value: " + intValue);
		double price =345;
		System.out.println("price :" + price);
		int price1 = 34563;
		double dprice = price1;
		System.out.println("double dprice is:" + dprice);
	}

}
