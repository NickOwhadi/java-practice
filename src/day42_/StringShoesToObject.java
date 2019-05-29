package day42_;
import java.util.*;
public class StringShoesToObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data="Bruno Magli,9.5";
		Shoes shoes=new Shoes();
		String[] arrData=data.split(",");
		
		System.out.println(shoes.getShoesData());
		
		Scanner scan=new Scanner(System.in);
		System.out.println("What shoes Brand?");
		String brand=scan.next();
		System.out.println("What is your size?");
		double size=scan.nextDouble();
		
		Shoes myShoes= new Shoes();
		myShoes.setShoesData(brand, size);
		System.out.println(myShoes.getShoesData());
		
		
		
		
		

	}

}
