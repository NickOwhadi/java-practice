package excersizes;

public class MethodCoverWithBracket {
	public static void main(String[] args) {
	    System.out.println(coverString("java rethods", "[me]") ) ; //java [me]thods
	  }
	  
	  public static String coverString(String main, String coverME) {
	    String replaceUnique="["+coverME+"]";
	    if(main.contains(coverME)) {
	   replaceUnique= main.replace(coverME, replaceUnique);
	    return replaceUnique;
	    }else {
	    	return main="["+main+"]";
	    }
	  }
	  
	}