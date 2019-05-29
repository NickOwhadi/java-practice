package day50_inheritance03;

public class App {
private String name;
public static int count;



public App(String name) {
	
	this.name = name;
}

public String getName() {
	return name;
}

public static void built(String language) {
	System.out.println("Built on app using "+language);
}

public void setName(String name) {
	this.name = name;
}

}
