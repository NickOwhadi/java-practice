package day30_customMethod;

import java.util.*;

public class Pushups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doPushUps();
		rangePrint();
		rangePrint();
	}
public static void rangePrint() {
	Scanner scan= new Scanner(System.in);
	System.out.println("enter 2 Integers");
	int a = scan.nextInt();
	int b = scan.nextInt();
	if(a<b) {
	for (int i=a; i<=b; i++) {
		System.out.print(i+" ");
	}	
	}else if(a>b){
	for(int j =a; j>=b; j--) {
		System.out.print(j+" ");
	}
	}else {
		System.out.print(a);
	}
	System.out.println();
	}

	public static void doPushUps() {
	int	Counter=0;
	for (int i=1; i<=10; i++) {
		System.out.println("Pushup "+i);
	}
	System.out.println("Time to rest");
	
	
	
	
	
	}

}
