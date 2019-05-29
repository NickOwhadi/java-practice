package day47_Blocks;

public class VariableAccess {
int myInstanceVar=40;

static int mystaticVariable=55;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(mystaticVariable);
		
		VariableAccess v=new VariableAccess();
		System.out.println(v.myInstanceVar);
		System.out.println(v.mystaticVariable);
		System.out.println(VariableAccess.mystaticVariable);
		
		
		
		
		
		

	}

}
