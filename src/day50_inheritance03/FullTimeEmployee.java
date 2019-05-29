package day50_inheritance03;

public class FullTimeEmployee extends Employee {
	@Override
	public  void CalculatePay(double hours, double rate) {
		double total=(hours*rate)*1.05;
		System.out.println("Full time Emploee totoal pay "+total);
	}
}
