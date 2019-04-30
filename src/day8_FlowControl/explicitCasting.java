package day8_FlowControl;

public class explicitCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10 /2.0);
		//alwayes larger that the one with decimal
		System.out.println(10.0 /2);
		int result = (int)(10 / 2.0);
		
		int rent1 = 987;
				int rent2 = 1100;
				int rent3 = 894;
				int rent4 =1234;
				double average = (rent1+rent2+rent3+rent4) / 4.0;
				//double average = (double)(rent1+rent2+rent3+rent4) / 4;
				System.out.println("Average is: " + average);
				double d = 40.2;
				int i = (byte)d;
				System.out.println("i is:" + i);
	}

}
