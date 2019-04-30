package day8_FlowControl;

public class castingPrimitives {

	public static void main(String[] args) {
		// cast double value to int
		int i = (int)3.4;
		System.out.println("i:" +i);
		double price = 230.50;
		int dollars = (int)price;
		System.out.println("price: "+ price);
		System.out.println("dollars: " + dollars);
		//whole numbers. byte, short, int
		int count = 127;
		byte byteCount = (byte) count;
		System.out.println("ByteCount: " + byteCount);
		long longValue = 34565L;
		int intValue = (int) longValue;
		System.out.println("Int Value: " + intValue);
		int large = 5678;
		short small = (short) large;
		System.out.println("Small: " + small);
		int result = (int) (500.4 /2.0);
		System.out.println("Result: " + result);
		
		

	}

}
