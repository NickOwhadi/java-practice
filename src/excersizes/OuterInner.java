package excersizes;
import java.util.*;
public class OuterInner {
	


	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
			int sizeInner = scan.nextInt();
			int sizeOuter = scan.nextInt();
			int[] inner = new int[sizeInner];
			int[] outer = new int[sizeOuter];
			for(int i =0; i < sizeInner; i++) {
				inner[i] = scan.nextInt();
			}
			for(int j =0; j < sizeOuter; j++) {
				outer[j] = scan.nextInt();
			}
			Arrays.sort(inner);
			Arrays.sort(outer);
			//WRITE YOUR CODE HERE
		
	int i=0;
	int j=0;
	int count=0;
	while(j<outer.length && i<inner.length){
	if(outer[j]==inner[i]) {
	count++;
	i++;
	j++;
	}
	else j++;
	}
	
	  if(count == inner.length) {
		  System.out.println(true);
	  }else {
		  System.out.println(false);
	  }
	  }
}