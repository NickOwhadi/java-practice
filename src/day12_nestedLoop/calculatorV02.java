package day12_nestedLoop;
import java.util.*; 
public class calculatorV02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double num1,num2,result;
		String operator;
		System.out.println("Enter first number");
		num1=scan.nextDouble();
		System.out.println("Enter second number");
		num2=scan.nextDouble();
		System.out.println("choose operation: +,-,*,/,%");
		operator=scan.next();
		result = 0.0;
		switch (operator) {
		case"+":
			result = num1 + num2;
			break;
			case"-":
				result = num1 - num2;
				break;
				 case"*":
					result = num1 * num2;
					break;
					 case"/":
						result = num1 / num2;
						break;
						 case"%":
							result = num1 % num2;
							System.out.println("result"+ result);
							break;
							default:
								System.out.println("Invalid operator selected: " + operator);
			
		}
}
}			
			