package day27_main;

import java.util.Arrays;

public class Splitcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 147=java, mentoring 204,149 SDLC,152 QA testing,144 team activity,143,wecome kit
	String url1 ="https://learn.cybertekschool.com/courses/147";
	String url2="https://learn.cybertekschool.com/courses/144";
	String url3="https://learn.cybertekschool.com/courses/149";
	
	//int number =Integer.parseInt();
	String[] urlArr = url2.split("/");
	System.out.println(Arrays.toString(urlArr));
	int number =Integer.parseInt(urlArr[urlArr.length-1]);
	switch(number) {
	case 147:
		System.out.println("It is Java programming");
		break;
	case 204:
		System.out.println("It is mentoring");
		break;
	case 149:
		System.out.println("It is SDLC");
		break;
	case 152:
		System.out.println("It is QA testing");
		break;
	case 144:
		System.out.println("It is team activity");
		break;
	case 143:
		System.out.println("It is Welcome kit");
		break;
	default:
	}
	}
}
