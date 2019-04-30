package day_33MethodCustom;

public class MethodAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addVoid(2,5);
		int sum = add(4,8);
		
		System.out.println(sum);
		System.out.println(add(10,30));
		System.out.println(multiply(5.6,6.5));
		System.out.println(minus(12,7));
		System.out.println(divide(5.6,6.5));
		
		
		
		
	}
	public static void addVoid(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("Sum: " + sum);
	}
	
	/*
	 2) method name: add
     return type: int
     params: int num1, int num2
     add them and return the sum
	 */
	public static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	/*
	 Method: multiply with return value
     Method: minus with return value
     Method: divide with return value
	 */
     public static double multiply(double num1, double num2) {
    	 	double result = num1 * num2;
    	 	return result; 
    	 	//return num1 * num2;
     }
     
     public static double minus(double num1, double num2) {
    	 	double result = num1 - num2;
    	 	return result;
    	 	//return num1 - num2;
     }
     
     public static double divide(double num1, double num2) {
    	 	if(num2 == 0) {
    	 		System.out.println("ERROR: Cannot / by 0");
    	 		return 0;
    	 	}else {
    	 	   double result = num1 / num2;
    	 	   return result;
    	 	}
     }
	
}