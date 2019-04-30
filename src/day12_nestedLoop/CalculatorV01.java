package day12_nestedLoop;
import java.util.*;
public class CalculatorV01 {

	public static void main(String[] args) {
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
if(operator.equals("+")) {
	result = num1 + num2;
}
else if(operator.equals("-")) {
	result = num1 - num2;
}
else if(operator.equals("*")) {
	result = num1 * num2;
}
else if(operator.equals("/")) {
	result = num1 / num2;
}
else if(operator.equals("%")) {
	result = num1 % num2;
}
else {
	System.out.println("Invalid operator selected: " + operator);
	return;
}
    System.out.println("result:" + result);
	}

}
