package day51_;

public class Snowboarding extends Exercise{
	public int perform(int minutes) {
		int cal=super.perform(10);
		System.out.println("Snowboarding");
		return minutes*7+cal;
	}
}
