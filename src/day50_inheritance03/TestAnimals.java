package day50_inheritance03;

public class TestAnimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal an=new Animal();
		Cat cat=new Cat();
		Dog dog=new Dog();
		Duck duck=new Duck();
		
		an.speak();
		cat.speak();
		dog.speak();
		duck.speak();
		cat.move(20);
		dog.move(30);
		duck.move(40);
		

	}

}
