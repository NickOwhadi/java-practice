package day18_loopWhile;

public class StairCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String stairs="*";
      int num =1;
      while(num<=10){
    	  System.out.println(stairs);
    	  stairs +="*";
    	  num++;
      }
      String str="*";
      while(str.length()<=10) {
    	  System.out.println(str);
    	  str +="*";  
      }
	}

}
