package day53_inheritance6;

public class City {
	private int id;
	private String name;
	public int count=100;
	
	public static void buildARoad() {
		System.out.println("City-building a road");
	}
	
	public void letsBuildARoad() {
		buildARoad();
	}
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public City(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "id:" + id + ", name:" + name+"Count: "+count;
	}
	@Override
	public int hashCode() {
		return id+name.length();
	}
	@Override
	public boolean equals(Object obj) {
		City anothercity=(City) obj;
		if(this.id==anothercity.id&&
	this.name.contentEquals(anothercity.name)) {
			return true;
		}
		return false;
	}
	

}
