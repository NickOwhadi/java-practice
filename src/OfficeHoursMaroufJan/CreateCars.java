package OfficeHoursMaroufJan;

public class CreateCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car delroean=new Car("GM","DeLorean", "20000");
		
		System.out.println(delroean.getMake());
		System.out.println(delroean.getModel());
		System.out.println(delroean.getPrice());
		
		
		Car corolla=new Car("Toyota","Corolla","20000");
		System.out.println(corolla.getMake());
		System.out.println(corolla.getModel());
		System.out.println(corolla.getPrice());

	}

}
