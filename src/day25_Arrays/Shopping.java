package day25_Arrays;

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double totalPrices=0.0;
		String[] products= {"Timberland Shoes", "H&M Shirt", "Swatch Watch Watch", "Gucci Bag", "Addidas Socks"};
		double [] prices = {120.0, 5.99, 150.50, 3000.5, 6.99};
		int[] itemsId= { 123455, 123456, 123457, 123458, 123459};
	if (products.length==prices.length && products.length==itemsId.length) {
		
	
	}
	
	for(String product  :products) {
		System.out.println(product);
	}
	for (int i=0; i<prices.length; i++) {
		System.out.println(prices[i]);
		
	}
	for (int idx=itemsId.length-1; idx>=0; idx--) {
		System.out.println(itemsId[idx]);	
}
System.out.println("##############");
	for (int i=0; i<prices.length; i++) {
		System.out.println("Item " + (i+1)+ ": "+itemsId[i]+ " - " + products[i]+ " - "+prices[i]);
		totalPrices+= prices[i];
	}
	System.out.println("Total "+ totalPrices);
	int maxIndex =0;
	double maxPrice=0;
	for (int i=0; i<prices.length; i++) {
		if (prices[i]>maxPrice) {
			maxPrice = prices[i];
			maxIndex = i;
		}
		
	}
	System.out.println(maxIndex+ "--"+ maxPrice);
}
}
