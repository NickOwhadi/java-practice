package day15_string_manipulations;

public class indexOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    String list = "html-selenium-angular-jenkins-grid";
    int firstDash = list.indexOf("-");
    System.out.println("Fist dash"+firstDash);
    int secondDash = list.indexOf("-", 5);
    System.out.println("second dash: "+ secondDash);
    int thirdDash = list.indexOf("-", secondDash+1);
    System.out.println("third is:"+ thirdDash);
    
    int lastDash=list.lastIndexOf("-");
    System.out.println("last dash:"+lastDash);
	}

}
