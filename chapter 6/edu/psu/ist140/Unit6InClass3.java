package edu.psu.ist140;

import java.util.ArrayList;
import java.util.Scanner;


public class Unit6InClass3 {
    /**
     *  Write a method called getNumbers that takes no parameters and returns an ArrayList of integers. 
     * In the method, write a loop that allows the user to enter as many integers as they like.  
     * Store the entered ints in an ArrayList<Integer> called nums and return the list when finished.
     * Write a method calcAverage that takes an ArrayList<Integer> as a parameter and returns a double. 
     * Compute the average of the integers in the ArrayList<Integer> passed and return this value.
     * 
    */
    
    public static ArrayList<Integer> getNumbers(){
        Scanner in = new Scanner (System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        System.out.println("Enter a list of integers, separated by the return key. \nPress any other key to stop.");
        while (in.hasNextInt()){
             nums.add(in.nextInt());
        }
        return nums;
    }

    public static double calcAverage (ArrayList<Integer> nums){
        double sum = 0;
        for (int i = 0; i < nums.size(); i++){
            sum += nums.get(i);
        }
        double average = sum / nums.size();
        return average;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = getNumbers();
        System.out.println("\nThe average of the numbers is " + calcAverage(numbers));
    }
}
