package day47_Blocks;

public class Carpet {
	public double width, length, unitPrice, totalPrice;
	public boolean isPersian;

	public Carpet() {
		width=300;
		length=300;
		isPersian=false;
		unitPrice=isPersian? 200 : 0;
		totalPrice=200;
	}

	public Carpet(double width, double length, double unitPrice, boolean isPersian) {
		this.width = width;
		this.length = length;
		this.unitPrice = unitPrice;
		this.isPersian=isPersian;
		setTotalPrice(totalPrice);
		
		
	}

	

	public void setTotalPrice(double totalPrice) {
		if(isPersian==true) {
			totalPrice=(width+length)*unitPrice+200;
		}else {
			totalPrice=(width+length)*unitPrice;
		}
		this.totalPrice = totalPrice;
	}
	
	
}