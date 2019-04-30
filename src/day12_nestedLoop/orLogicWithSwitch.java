package day12_nestedLoop;

public class orLogicWithSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char grade = 'E';
switch (grade) {
case'A':
case'B':
case'C':
	System.out.println("Pass");
	break;
case'D':
case'E':
	System.out.println("Fail");
	break;
	default:
		System.out.println("Invalid grade");
}
	}

}
