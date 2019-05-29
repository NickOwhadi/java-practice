package excersizes;

public class Item1 {
	 //private instance variables
    private String name;
    private int catalogNumber;
    private int quantity;
    private double price;
	public Item1(String name, int catalogNumber, int quantity, double price) {
		
		this.name = name;
		this.catalogNumber = catalogNumber;
		this.quantity = quantity;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCatalogNumber() {
		return catalogNumber;
	}
	public void setCatalogNumber(int catalogNumber) {
		this.catalogNumber = catalogNumber;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item1 {name=" + name + ", catalogNumber=" + catalogNumber + ", quantity=" + quantity + ", price="
				+ price + "}";
	}
    
}
