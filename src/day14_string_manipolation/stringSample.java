package day14_string_manipolation;

public class stringSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str1 = "Good Morning";
       if(str1.equals("Good Morning")) {
    	   System.out.println("Match");
       }else {
    	   System.out.println("not match"); 
       }
       if(str1.equalsIgnoreCase("Good Morning")) {
    	   System.out.println("Match, ignore case");
       }else {
    	   System.out.println("not match"); 
       }   
       if(str1.toLowerCase().equals("good morning")) {
    	   System.out.println("chainig methods: Match");
       }else {
    	   System.out.println("chained Method not Match");
       }
       String myName = "Nick";
       System.out.println(myName.length());
       int lenght=myName.length();
       System.out.println("My name's lenght: "+ lenght);
       String sr2 = "nickOwhadi";
       if(sr2.length() >= 6) {
    	   System.out.println("Password is ok");
       }else {
    	   System.out.println("password is no good");
       }
    
       
       
       
	}

}
