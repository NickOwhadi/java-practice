package exCodingBath;

public class StringEvenMidlle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="noisxxnotyynotxisi";
		str=str.replaceAll("is", "1");
		System.out.println(str);
		str=str.replaceAll("not","2");
		System.out.println(str);
		int count1=0, count2=0;
		for(int i=0; i<str.length(); i++) {
	if(str.charAt(i)=='1') {
		count1++;
	}
	if(str.charAt(i)=='2') {
		count2++;
	}
		}
		
		}

}
