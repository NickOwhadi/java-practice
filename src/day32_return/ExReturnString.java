package day32_return;

public class ExReturnString {
public static void main(String[] args) {
	String [] some_array = {"a","foo","bar","foo","bla"};

		String	some_string = "foo";
	System.out.println(count_appearance(some_array,some_string));
}
public static int  count_appearance(String[] arr,String t) {
int count=0;
for(String n:arr) {
	if(n.equals(t)) {
		count++;
		
	}
	
}
return count;
}
}