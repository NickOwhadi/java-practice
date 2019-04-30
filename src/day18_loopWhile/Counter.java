package day18_loopWhile;

public class Counter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     //1,2,3,4,5,
		int num =1;
		while(num<=10) {
			System.out.print(num+" ,");
			num++;
			Thread.sleep(200);
		}
		System.out.println("\n"+num);
		int num2 =11;
		while(num2>=1) {
			System.out.print( +num2+ " ,");
			num2--;
			Thread.sleep(300);
		}
		System.out.println("\n" +num2);
	}

}
