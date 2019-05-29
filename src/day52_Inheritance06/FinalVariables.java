package day52_Inheritance06;

public class FinalVariables {
	
	public final int ROADSTER_MAX_RANGE=610;
	public final int MODEL_3_MAX_SPEED;
	public final int MODEX_X_PASSENGERS;
	public final String JAN="January";
	
	public static final String COMPANY_NAME="Cybertek";
	public static final String ADMIN_USERNAME;
	static{
		ADMIN_USERNAME="admin@gmail";
	}
	public FinalVariables() {
		MODEL_3_MAX_SPEED=190;
	}
	//public FinalVariables(int max) {
	//	MODEL_3_MAX_SPEED=max;
	//}
	{
		MODEX_X_PASSENGERS=7;	
	}
	
	
	
	public static void main(String[] args) {
	final int MAX_PASSENGERS_COUNT=5;
	final double PI=Math.PI;
	final int SSN;
	SSN=321456984;
	FinalVariables finalVars=new FinalVariables();
	System.out.println("MAX range for roadster: "+finalVars.ROADSTER_MAX_RANGE);
	System.out.println("max speed"+finalVars.MODEL_3_MAX_SPEED);
	System.out.println("Passengers"+finalVars.MODEX_X_PASSENGERS);
	System.out.println(Math.PI);
	System.out.println("Company name: "+COMPANY_NAME);
	System.out.println("Admin"+ADMIN_USERNAME);
}
}
