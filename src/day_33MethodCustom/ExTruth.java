package day_33MethodCustom;

public class ExTruth {
	 public static boolean threeLocks(boolean a, boolean b, boolean c) {
		    if((a && b)||c){
		      return true;
		    }else
		    return false;
		    
		  }//end threeLocks
		  public static void main(System[] args){
		    System.out.println(threeLocks(true,true,true));
		  }
		}

