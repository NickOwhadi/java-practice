package excersizes;
import java.util.*;
public class ZZumbie {


		 public static void main(String[] args) {
			    Scanner input = new Scanner(System.in);
			    int[] inhabitants = new int[8];
			    for(int i=0; i<inhabitants.length; i++) {
			      inhabitants[i] = input.nextInt();
			    }
			    
			    //TODO. Write you code below this line.
			  int sum1=0;
					for(int i=0; i<8; i++) {
						
						int sum=0;
						
						
						
						System.out.println("Day "+i+" "+Arrays.toString(inhabitants));	
					for(int idx=0; idx<8;  idx++) {
						
						sum=sum+inhabitants[idx];
				if(idx-1==0||idx+1==0) {		
					
					inhabitants[idx] = inhabitants[idx] / 2;
				}
				
					}
				
					 sum1=sum;
					 if(sum1==0) {
							break;
						}
					
					}
					
					System.out.println("---- EXTINCT ----");
			}
			}
