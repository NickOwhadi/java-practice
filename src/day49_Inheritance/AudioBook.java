package day49_Inheritance;

public class AudioBook extends Book{
	private double length;
	private String narrator;
	
	public void listen() {
		System.out.println("Listening to "+getTitle()+" by "+getAuthor()+
				"narrated by "+ getNarrator());
	}
	@Override
	public String toString() {
		return "AudioBook [length=" + length + ", narrator=" + narrator + "]";
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public String getNarrator() {
		return narrator;
	}
	public void setNarrator(String narrator) {
		this.narrator = narrator;
	}

}
