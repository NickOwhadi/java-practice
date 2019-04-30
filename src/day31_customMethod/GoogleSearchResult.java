package day31_customMethod;

public class GoogleSearchResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String results="About 121,000,000 results (0.53 seconds)";
		search("About 121,000,000 results (0.53 seconds)");
		search(results);
	}
	public static void search(String results) {
		String [] words=results.split(" ");
		String count=words[1].replace(",", "");
		String seconds=words[3].replace("(", "");
		System.out.println("Results count: "+count);
		System.out.println("seconds count: "+seconds);
	}
	
	

}
