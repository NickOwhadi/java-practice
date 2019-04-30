package excersizes;

public class Utopian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int growth = 0;
		int year = 0;
		int treeSize = 0;
		for (year = 1; year <= 10; year++) {
			if (year <= 3) {
				growth = 1;
				treeSize += growth;
			} else {
				growth = 2;//year 1 - growth 1 cm
				treeSize += growth;//tree size: 1cm
			}
			System.out.println("year "+year+" - growth "
			+growth+" cm\n"+ "tree size: "+treeSize+"cm");
		}
	}
}