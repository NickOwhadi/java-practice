package day_40;

public class BestBuy {
	public static void main(String[] args) {
		CellPhone cell1=new CellPhone();
		System.out.println(cell1.brand);
		System.out.println(cell1.price);
		cell1.brand="Nokia 6300";
		cell1.screenSize=2.0;
		cell1.color="Silver";
		cell1.price=76.16;
		System.out.println("Brand is: "+cell1.brand);
		System.out.println("Screen Size is: "+cell1.screenSize);
		System.out.println("Color is: "+cell1.color);
		System.out.println("price is: "+cell1.price);
		CellPhone cell2= new CellPhone();
		cell2.brand="Siemens";
		cell2.screenSize=1.5;
		cell2.color="blue";
		cell2.price=39.22;
		System.out.println("#### CELL 2 VALUES######");
		System.out.println("Brand is: "+cell2.brand);
		System.out.println("Screen Size is: "+cell2.screenSize);
		System.out.println("Color is: "+cell2.color);
		System.out.println("price is: "+cell2.price);
		
	System.out.println("###########CALLING METHODS#########");
	cell1.call();
	cell1.message();
	
	cell2.call();
	cell2.message();
	cell2.call();
	cell2.message();
	cell1.takePhoto();
	cell2.takePhoto();
	
		
		
		
		
		
		
		}
}
