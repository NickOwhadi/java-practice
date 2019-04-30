package day13_ternry_string_intro;

public class moreTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String quality = "good";
		int rating =(quality.equals("good")) ? 100 : 0;
		System.out.println("Rating: "+rating);
		int PMhour =6;
		boolean rushHour = (PMhour>=4 && PMhour<=7)? true : false;
		
	//	System.out.println(PMhour + " isrush hour? "+rushHour);
		String result = (rushHour)? "yes":"no";
		System.out.println(result);
		int AMHour = 8;
		
		String amRushHour = AMHour>+6 && AMHour<+9? "yes":"no";
		System.out.println(amRushHour);
	}

}
