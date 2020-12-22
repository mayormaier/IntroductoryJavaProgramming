package edu.psu.ist140;

import java.util.Scanner;

public class Unit3Practice{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int month = 0;
        int day = 0;

        
        while (month == 0){
            System.out.print("Enter a month as a number, 1-12: ");
            if (in.hasNextInt()){
                month = in.nextInt();
            } else {
                System.err.println("Please Enter a valid input.");
                month = 0;
        
            }
            if (month > 12 || month < 1) {
                System.err.println("Please enter a valid input (A month 1-12)");
                month = 0;
            }
        }
        String season = "";
        if (month == 1 || month == 2 || month == 3){
            season = "Winter";
        }
        else if (month == 4 || month == 5 || month == 6){
            season = "Spring";
        }
        else if (month == 7 || month == 8 || month == 9){
            season = "Fall";
        } else {
            season = "Winter";
        }

        System.out.println(season);
    }
}