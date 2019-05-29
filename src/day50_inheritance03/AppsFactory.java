package day50_inheritance03;

public class AppsFactory {
public static void main(String[] args) {
	IPhoneApp iApp=new IPhoneApp();
	IPhoneApp iApp2=new IPhoneApp("Uber");
	AndroidApp andrApp=new AndroidApp();
	AndroidApp andrApp2=new AndroidApp("Lyft");
	
	System.out.println(iApp.getName());
	System.out.println(iApp2.getName());
	
	System.out.println(andrApp.getName());
	System.out.println(andrApp2.getName());
	App.count=33;
	System.out.println("IPhone count: "+IPhoneApp.count);
	AndroidApp.count=100;
	System.out.println("Android count: "+AndroidApp.count);
	App.built("Swift");
	App.built("Objective C");
	AndroidApp.built("java");
	andrApp2.built("JS");
	
	
	
}
}
