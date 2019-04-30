package day19;

public class DoWhileVSWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int i =1;
         do {System.out.println(i++);//println(i); i++;
        	 
         }while(i<=10);
         // 
         int sum = 0;
         int j =1;
         do {
        	 
        	 sum+= j++;
         }while(j<=5);
         System.out.println("Sum from 1 to 5 is "+ sum);
         
	}

}
