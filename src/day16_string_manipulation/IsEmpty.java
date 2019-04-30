package day16_string_manipulation;

public class IsEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName = "";
		String password ="";
		System.out.println(userName.isEmpty());
		if (userName.isEmpty()) {
			System.out.println("Username field cannotbe empty");
		} else {

			System.out.println("Username is not empty");
		}
		if (userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username field cannotbe empty");
		} else {

			System.out.println("Username is not empty");
		}
		if(userName.length()==0) {
			System.out.println("Username is 0, so it is empty");
			}
		
			
		
	}

}
