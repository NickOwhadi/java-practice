package day7_scanner;

public class preAndPost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=0;
int num2=num++;
System.out.println("num: "+num);
System.out.println("num2 " +num2);
int n =0;
int n2 = ++n;
System.out.println("n: "+n);
System.out.println("n2: "+n2);
int bananas = 6;
int pears = ++bananas;
int apples = bananas++;
System.out.println("Banna" +bananas);
System.out.println("apples " +apples);
System.out.println("pears " +pears);
int friends =10;
System.out.println(++friends);
System.out.println(friends);
int p1 = 10;
int p2 = p1++ + 5;
System.out.println(p1);
System.out.println(p2);
int batteries = 8;
int oldbatteries = 5;
int total =batteries++ + ++oldbatteries;

System.out.println();

	}

}
