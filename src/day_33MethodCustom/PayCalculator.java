package day_33MethodCustom;

public class PayCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int pay = getHourlyPay(0, 50);
System.out.println("Total pay for 40 hours: "+ pay);
	}
	
	public static int getHourlyPay(int hours, int rate) {
		if(hours<=0) {
			System.out.println("Invalid hours");
			return 0;
		}
		if(rate<=0) {
			System.out.println("Invalid rate");
			return 0;
		}
		int salary = hours * rate;
		return salary;
		
	}

}
