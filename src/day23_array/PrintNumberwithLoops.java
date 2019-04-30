package day23_array;

public class PrintNumberwithLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int j = 1; j <=2; j++) {
			for (int i = 0; i <=10; i++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		for (int i = 1; i<=20; i++) {
			if(i>=5 && i<=10) {
				continue;
			}
			System.out.print(i+", ");
		}
	}

}
