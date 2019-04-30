package day06_operators2;

public class shortHandOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int students = 45;
		students = students + 5;
		System.out.println("Students : " + students);
		students = students -2;
		System.out.println("students " + students);
		int teachers = 10;
		System.out.println("Teaxhers " + teachers);
		teachers +=2;
		teachers -= 5;
		System.out.println("Teachers: " + teachers);
		int cars =12;
		cars *=2;//  cars = cars * 2;
		System.out.println(cars);
		cars += cars;
		System.out.println(cars);
		System.out.println(cars);
		int shoes = 20;
		shoes /= 4;
		System.out.println(shoes);
		double price = 45.50;
		double amount =5;
		price += amount;
		System.out.println(price);
		
		int minutes = 66;
		minutes %= 60;
		System.out.println(minutes);
		
		int penies = 550;
		penies %= 100; // penies = penies % 100;
		System.out.println(penies);
		}

}
