package day41_classesMethods;

public class MyCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1=new Car();
		car1.make="Ford";
		car1.model="Fiesta";
		car1.color="Grey";
		car1.currentSpeed=55;
		
		car1.printCarInfo();
		car1.showCurrentSpeed(70);
		car1.showCurrentSpeed(35);
		car1.drive();
		String currentSpeed;
		
		car1.showCurrentSpeed(55);
		car1.accelerate(20);
		
		
		System.out.println("Before "+car1.currentSpeed);
		car1.accelerate(20);
		System.out.println("after "+car1.currentSpeed);
		BMW bmw=new BMW();
		System.out.println(bmw.make);
		bmw.model="m3";
		bmw.showPrice();
		System.out.println("Car Price: "+bmw.price);
		BMW bmw2=new BMW();
		bmw2.model="X3";
		System.out.println("Car Price: "+bmw2.price);

	}

}
