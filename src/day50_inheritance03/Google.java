package day50_inheritance03;

public class Google extends SearchEngine {
	public int search(String item) {
		System.out.println("Searching for :"+item);
		int resultCount=item.length();
		return resultCount;
	}
	public void search(String item, String item2) {
		System.out.println("Searching for 2 items :"+item+" , " +item2);
		int resultCount=item.length()+item2.length();
		
	}
	public String clickResult() {
		System.out.println("Clicking result");
		return "Search result page";
	}
}
