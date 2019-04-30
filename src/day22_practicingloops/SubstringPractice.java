package day22_practicingloops;

public class SubstringPractice {

	public static void main(String[] args) {
	  	// TODO Auto-generated method stub
        String word = "java";
        int i=0;
        System.out.println(word.substring(0,1));
        System.out.println(word.substring(1,2));
        System.out.println(word.substring(2,3));
        System.out.println(word.substring(3));
       
        i=0;
        System.out.print(word.substring(i,i+1));
        i++;
        System.out.print(word.substring(i,i+1));
        i++;
        System.out.print(word.substring(i,i+1));
        i++;
        System.out.print(word.substring(i,i+1));
        
        i=0;
        do{System.out.println(word.substring(i,i+1));
        	i++;
        }while(i<=word.length()-1);
        System.out.println();
        for(int n =0; n<=3; n++) {
        	System.out.println(word.substring(n,n+1));
        }
        
        for (int n=3; n>=0; n--) {
        	System.out.println(word.substring(n,n+1));
        }
        int start =1;
        int end =5;
        String word2 = "UnitedStates";
        System.out.println(word2.substring(start, end));
        
        
        
        
        
        
        
	}

}
