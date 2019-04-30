package day32_return;

public class MethodReturns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(giveMe10$());
int i =giveMe10$();
System.out.println("i: "+i);
System.out.println(giveMeYourName());
String myName = giveMeYourName();
System.out.println(myName);
	}
	public static int giveMe10$() {
		System.out.println("Returning 10 from method");
		return 10;
	}
	public static String giveMeYourName() {
		return "Nick Owhadi";
	}
	

}
