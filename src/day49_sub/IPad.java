package day49_sub;
import day49_Inheritance.Device;
public class IPad extends Device {
	public void readEBook(String title) {
		System.out.println("Reading  a book "+title+"using"+brand+" tablet");
	   System.out.println("Model "+model);
	  // System.out.println("Price: "+price);not visible(default)
	 //System.out.println("Made in "+country);not visible
	}

}
