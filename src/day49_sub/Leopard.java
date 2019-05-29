package day49_sub;

public class Leopard extends Animal {
	public Leopard() {
		super();
		System.out.println("Leopard constructor");
		setType("Leopard");
	}
	public Leopard(String type) {
		super(type);//Call animal (String type) constructor
		System.out.println("Leopard one arg constructor");
	}

}
