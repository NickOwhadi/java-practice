package excersizes;

import java.util.Arrays;

public class DataBaseLameReplit {
	public static String lameDb(String db, String op, String id, String data) {
		String[] dataListing = db.split("#");
		String dataBase = "";
		if (op.equals("add")) {
			dataBase = db + "#" + id + data;
		} else if (op.equals("delete")) {
			for (int i = 0; i < dataListing.length; i++) {
				
				if (i == Integer.parseInt(id) - 1) {
					dataListing[i] = "";
					
				}
				
				
				dataBase +=dataListing[i]+"#";
			
			}

		} else if (op.equals("edit")) {
			for (int i = 0; i < dataListing.length; i++) {

				if (i == Integer.parseInt(id) - 1) {
					dataListing[i] =id+data;
					
				}
				dataBase +=dataListing[i]+"#";
				
			}
			

		} else {
			dataBase = db;
		}
		if(dataBase.charAt(dataBase.length()-1)=='#') {
			dataBase=dataBase.substring(0,dataBase.length()-1);
		}
		if(dataBase.charAt(0)=='#') {
			dataBase=dataBase.substring(1,dataBase.length());
		}
		return dataBase;
	}// end lameDb

	public static void main(String[] args) {

		System.out.print(lameDb("1etsy#2wooden#3spoon", "add", "4", "aaa") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "edit", "2", "bbb") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "delete", "1", "") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "none", "1", "") + "\n");

	}

}
