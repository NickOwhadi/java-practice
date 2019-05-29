package day53_inheritance6;

public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		City baku=new City(123,"Baku");
		System.out.println(baku.toString());
		
		City istanbul=new City(444,"Istanbul");
		City anothercity=new City(444,"Istanbul");
		if(istanbul.equals(anothercity)) {
			System.out.println("Both are Istanbul");
		}
		System.out.println(istanbul.toString());
		System.out.println(anothercity.toString());
		
		System.out.println(baku.hashCode());
		System.out.println(istanbul.hashCode());
		System.out.println(anothercity.hashCode());
		
		Capital cap=new Capital(101, " Washington DC",800000);
		System.out.println(cap.toString());
		
		
		
		
		
		
		
		
		
	}

}
