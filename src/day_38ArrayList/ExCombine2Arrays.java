package day_38ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public abstract class ExCombine2Arrays {

	public static void main(String[] args) {
		
		String[] a1= {"me","you","them"};
		String[] a2= {"mem","youy","themth"};
System.out.println(combineRs(a1,a2));
	}
	public static String combineRs(String[] r1,String[] r2) { 
	  
	  ArrayList<String> combine=new ArrayList <>();
	  
	  String add1="";
	  for(int i=0; i<r1.length; i++) {
		  combine.add(r1[i]);
	  }
	  for(int j=0; j<r2.length; j++) {
		  combine.add(r2[j]);
	  
	  }
	  
	  for(int z=0; z<combine.size(); z++){
	  add1+=combine.get(z);
	  
	  }
return add1;
}
}