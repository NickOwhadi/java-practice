package day_33MethodCustom;

public class AgeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(calculateAge(1999));
	}
	public static int calculateAge(int year) {
		int age = 2019-year;
		if(age<0) {
			System.out.println("Invalid Number");
			return 0;
		}
		if(age>1 && age < 14) {
			System.out.println("Child");
				
		}
		if(age>15 && age < 25) {
			System.out.println("Youngster");
				
		}
		if(age>=26 && age <= 64) {
			System.out.println("Adult");
				
		}
		if(age>=65) {
			System.out.println("Senior");
				
		}
		return age;
	}
	

}
