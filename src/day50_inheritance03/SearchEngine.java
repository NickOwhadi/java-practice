package day50_inheritance03;

public class SearchEngine {
	public int search(String item) {
		System.out.println("Searching for :"+item);
		int resultCount=item.length();
		return resultCount;
	}
	protected void search(String item, String item2) {
		System.out.println("Searching for 2 items :"+item+" , " +item2);
		int resultCount=item.length()+item2.length();
		
	}
	protected String clickResult() {
		System.out.println("Clicking result");
		return "Search result page";
	}

}
