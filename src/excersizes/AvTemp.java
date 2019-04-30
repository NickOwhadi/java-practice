package excersizes;
import java.util.*;
public class AvTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scan = new Scanner(System.in);
				int k = 0;
				double total = 0;
				double avgTemp = 0;
				double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
						scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };
						for(k=0; k<temps.length-1; k++){
						  total+=temps[k];
						  avgTemp=total/(k+1);
						}
						
		  System.out.println("output: "+avgTemp);
		}
	}
	


