package day_34;

public class CountArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr1= {1,2,3,4,5,6,7,8,7,7};
		System.out.println(counted(new int []{4,3,2,7,7,8,7,5,7}, 7));
		System.out.println(counted(arr1, 7));
		System.out.println(counted(arr1, 7));
		int answer=counted(arr1,7);
		System.out.println(answer);
	}
	public static int counted(int []arr, int value) {
		int count=0;
		for(int v: arr) {
			if (v==value){
				count++;
			}
			
		}
		return count;
	}
	
	

}
