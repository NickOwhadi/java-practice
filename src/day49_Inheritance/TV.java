package day49_Inheritance;
//TV is a child/sub class in the same package
public class TV extends Device{
	public void watch() {
		System.out.println("Watching TV"+brand+" Model "+ model);
		System.out.println("Price: "+price);
		//System.out.println("Made in "+country);not visible
	}
	
	
	

}
