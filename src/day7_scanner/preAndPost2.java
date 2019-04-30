package day7_scanner;

public class preAndPost2 {

	public static void main(String[] args) {
		int messages =10;
		messages++;
		++messages;
		System.out.println("Messages: " + messages);
		// TODO Auto-generated method stub
int redMessages= --messages;
System.out.println("redm: " + redMessages);
System.out.println("dm: " + messages);
int unreadMessages = redMessages--;
System.out.println("un  " + unreadMessages);
System.out.println("read:  "+ redMessages);
int total = unreadMessages++ - redMessages--;
System.out.println("unreadMessages: " + unreadMessages);
System.out.println("readMessages :" + redMessages);
System.out.println("total: " + total);
int count =20;
int count2 = 10;
int totalcCount = ++count + --count2;
System.out.println("count:" + count);
System.out.println("count2: " +count2);
System.out.println("total: " +totalcCount);
int myCount = count++ + ++count;
System.out.println(count);
System.out.println(myCount);
}

}
