package day50_inheritance03;

public class Contractor extends Employee {
	@Override
	public  void CalculatePay(double hours, double rate) {
		System.out.println("Contractor Emploee totoal pay "+((hours * rate )+200));
	}
}
