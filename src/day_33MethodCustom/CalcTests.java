package day_33MethodCustom;

public class CalcTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(MethodAdd.add(3,1));
System.out.println(MethodAdd.multiply(5,6));
System.out.println(MethodAdd.minus(40,12));
System.out.println(MethodAdd.divide(100,2));
int addResult= MethodAdd.add(21, 41);
double mResult =MethodAdd.multiply(50, 40);
double miResult =MethodAdd.minus(3000, 200);
double dResult =MethodAdd.divide(455, 5);

System.out.println("addResult"+addResult);
System.out.println("mResult"+mResult);
System.out.println("miResult"+miResult);
System.out.println("dResult"+dResult);
double a = 10.0, b = 5.0;
double myResult=MethodAdd.minus(a, b);
System.out.println("myResult"+myResult);

double[] dNums = {2.0, 4.0};
double result2 = MethodAdd.multiply(dNums[0], dNums[1]);
System.out.println();
if(MethodAdd.add(10, 16) == 26) {
	System.out.println("Add Unit Test Passed");
}else {
	System.out.println("Add Unit Test failed");
}
String str = "java";
if(str.length() == 4) {
	System.out.println("It is 4 characters");
}else {
	System.out.println("It is not 4 characters");
}

}
}