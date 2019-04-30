package excersizes;
import java.util.*;
public class UniqueWords {
	

	
	public static void main(String [] args) {
		
   
            String[]  ip ={"java", "code", "python", "code", "rust", "code", "rust"};  
            for (int i = 0; i < ip.length; i++) {
            	boolean hasDup = false;
                for (int j = 0; j < ip.length; j++) {
                    if (i != j && ip[i].equals(ip[j])) {
                        hasDup = true;
                        break;
                    }
                }
                
                    if (!hasDup) {
                        System.out.println(ip[i]);                                                                                               
                        
                    }
                        
            }
            
    }
}

            
