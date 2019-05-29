package excersizes;

public class ReplaceXes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="xx";
		String res="";
		if(str.length()<2) {
			System.out.println(str);
			
		}else {
		res=str.substring(1,str.length()-1).replaceAll("x","");
		res=str.substring(0,1)+res+str.substring(str.length()-1);
		System.out.println(res);
		}	
	}

}
