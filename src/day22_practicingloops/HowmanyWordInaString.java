package day22_practicingloops;

public class HowmanyWordInaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String sentence = "He said hi, then she replied hi. hi guys!";
int count = 0;
for (int n=0; n<sentence.length()-1; n++) {
	String temp = sentence.substring(n,n+2);
	if(temp.equals("hi")) {
		count++;
	}
	
}System.out.println("There are "+count+" hi in this sentence");
	}

}
