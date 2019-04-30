package day7_scanner;

public class enoughtPizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//slices in pizza 8
		// slices per student 2
		int pizzaC = 50;
		int studentC = 145;
		boolean isEnoughPizza = pizzaC * 8 >=  studentC * 2;
		isEnoughPizza = pizzaC *8 / studentC >=2;
		System.out.println("is enought pizza: " + isEnoughPizza);
		
	}

}
