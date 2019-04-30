package day28_Arrays;

import java.util.Arrays;

public class SoccerTeam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//MultiD array and assign the value
        String[][] teams= new String [2][6];
        teams[0][0]= "Irena";
        teams[0][1]= "Zarif";
        teams[0][2]= "Cihan";
        teams[0][3]= "Habib";
        teams[0][4]= "Adel";
        teams[0][5]= "Bojan";
        
        teams[1][0]= "Olimjon";
        teams[1][1]= "Mirshod";
        teams[1][2]= "Usman";
        teams[1][3]= "Nursultan";
        teams[1][4]= "Roman";
        teams[1][5]= "Dmitriy";
        System.out.println("First player of first row");
        System.out.println(teams[0][0]);
        System.out.println(teams[0][3]);
        System.out.println(teams[1][5]);
        System.out.println("number of rows"+teams.length);
        System.out.println("number of people team1:"+teams[0].length);
        System.out.println("number of people team2:"+teams[1].length);
        System.out.println(Arrays.deepToString(teams));
        
       
	}

}
