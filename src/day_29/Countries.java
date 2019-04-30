package day_29;

import java.util.Arrays;

public class Countries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] countriesArray = { { "USA", "Washington DC" }, { "Canada", "Ottawa" }, { "Mexico", "Mexico city" },
				{ "Brasil", "Brasilia" }, { "Peru", "Lima" }, { "Argentina", "Boanes Aeros" }, { "Bolivia", "La Paz" },
				{ "Macedonia", "Scopia" }, { "Kazakhstann", "Nursultan" }

		};
		System.out.println(countriesArray[8][0] + "|" + countriesArray[0][0]);

		System.out.print(Arrays.deepToString(countriesArray));

		for (int i = 0; i < countriesArray.length; i++) {
			System.out.print(countriesArray[i][0] + "|");

		}
		System.out.println();
		System.out.println();
		for (String[] country : countriesArray) {
			System.out.print(country[0] + "|||");
		}
		System.out.println();
		System.out.println();
		for (String[] country : countriesArray) {
			System.out.print(country[1] + "|||");
		}

		String[] cities = new String[countriesArray.length];
		for (int i = 0; i < 9; i++) {
			cities[i] = countriesArray[i][1];

		}
		System.out.print(Arrays.toString(cities));
		System.out.println();
		System.out.println();

		for (int i = 0; i < countriesArray.length; i++) {
			if (countriesArray[i][0].equals("Bolivia")) {
			//System.out.println(countriesArray[i][1]);
				if(countriesArray[i][1].equals("La Paz")) {
					System.out.println("OK");
				}else {
					System.out.println("Failed");
				}
				break;
			}
		}
	}
}