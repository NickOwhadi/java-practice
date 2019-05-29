package day53_inheritance6;

public class Capital extends City{
	private long population;
	
	public int count=1;
	
	public Capital(int id, String name, long population) {
		super(id,name);
		this.population=population;
	}
	
	//public void letsBuildARoad() {
	//	buildARoad();
	//}
	public static void buildARoad() {
		System.out.println("Capital city-building a road");
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	
	public void displayCount() {
		System.out.println("Ciyt count"+super.count);
		System.out.println("Count here:"+count);
	}
	@Override
	public String toString() {
		return super.toString()+"Population: "+population+ " Count:"+count;
	}
	
}
