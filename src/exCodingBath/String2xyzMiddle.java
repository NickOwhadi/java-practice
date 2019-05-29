package exCodingBath;

public class String2xyzMiddle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="*";
		
		str=str.replace("**", "*");
		System.out.println(str);
		str=str.replace("**", "*");
		System.out.println(str);
		str=str.replace('*', 'A');
		System.out.println(str);
		str= str.replaceAll(".A.", "");
if(str.startsWith("A")) {
	str= str.replaceAll("A.", "");		
		}
if(str.endsWith("A")) {
	str= str.replaceAll(".A", "");		
		}
if(str.equals("A")) {
	str= "";		
		}
		
		  
		  System.out.println(str); 
		}

	}


