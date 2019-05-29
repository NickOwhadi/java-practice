package excersizes;

public class MaxArrayMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray= {3,4,5,7,1,9,3};
		double[] myArrayd= {3.2,4.7,5.4,7.2,1.9,9.2,3.8};
System.out.println(maxNum(myArrayd));
System.out.println(maxNum(myArray));
	}
	
	public static int maxNum(int[]numsArray) {
		int max=numsArray[0];
		for(int i=0; i<numsArray.length; i++) {
			if(max<numsArray[i]) {
				max=numsArray[i];
			}
		}
		return max;
	}
	public static double maxNum(double[]numsArray) {
		double max=numsArray[0];
		for(int i=0; i<numsArray.length; i++) {
			if(max<numsArray[i]) {
				max=numsArray[i];
			}
		}
		return max;
	}
	
	

}
