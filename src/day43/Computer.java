package day43;

public class Computer {
private	String brand;
private String os;
private double price;
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getOs() {
	return os;
}
public void setOs(String os) {
	this.os = os;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Computer [brand=" + brand + ", os=" + os + ", price=" + price + "]";
}
public Computer() {
	System.out.println("Computer constructor....");
	brand="Unknown";
	os="Unknown";
}
public Computer(String brand, String os, double price) {
	System.out.println("3 argument used....");
	this.brand=brand;
	this.os=os;
	this.price=price;
}
	
	
	
	
	
	
	

}
