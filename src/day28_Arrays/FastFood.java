package day28_Arrays;

import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FastFood {

	public static void main(String[] args) throws IOException {
		// read all data and assign to String array
		String[] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);
		System.out.println(data.length);

		System.out.println(data[0]);
		System.out.println(data[1]);
		System.out.println(data[data.length - 1]);
		int counter = 0;
		for (String resturant : data) {
			System.out.println("#" + counter + "==>" + resturant);
			counter++;
		}
		int countVA = 0;
		for (String row : data) {
			if (row.contains(",VA,")) {
				System.out.println(row);
				countVA++;
			}
		}
		System.out.println(countVA);
		for (String res : data) {

			if (res.contains(",VA,")) {
				String[] resArr = res.split(",");
				System.out.println(resArr[2] + "-" + resArr[1]);
			}
		}
	}
}
