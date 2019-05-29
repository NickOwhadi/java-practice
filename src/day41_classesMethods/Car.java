package day41_classesMethods;

public class Car {
	String make;
	String model;

	int currentSpeed;
	String color;
	
	public void printCarInfo() {
		System.out.println("Car Make: "+make+ "Model: "+"Color: "+color+
				"Current Speed: "+currentSpeed);
	}
	public void showCurrentSpeed(int speedLimit) {
		if(currentSpeed <= speedLimit) {
			System.out.println(make+" is driving at "+currentSpeed+
					" mph, following the speed limit -" + speedLimit);
		}else {
			System.out.println(make+" is driving at "+currentSpeed+
					" mph, over the speed limit -" + speedLimit);
		}
	}
	public void drive() {
		System.out.println(make+ model +"  is driving");
	}
	
	public void accelerate(int mph) {
		currentSpeed+= mph;
	}
	
}
