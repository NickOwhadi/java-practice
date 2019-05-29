package day52_Inheritance06;

public class Computer {
	private String model;
	private String color;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Computer() {
		super();
	}
	public Computer(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	public boolean equals(Object other) {
		Computer that=(Computer)other;
		if(model.contentEquals(that.model)&&
				color.contentEquals(that.color)) {
			return true;
		}
		return false;
	}

}
