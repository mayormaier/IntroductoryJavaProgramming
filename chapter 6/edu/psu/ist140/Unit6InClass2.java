package edu.psu.ist140;

import java.util.Arrays;
import java.util.Random;

public class Unit6InClass2 {
    
/**
 * Write a method, fillWithRandom, that takes an integer parameter, 
 * {@code upper}, holding an upper bound for the random numbers generated 
 * and returns an array of random integers between 1..{@code upper}. The array 
 * returned should have a max length of 7. 
 * 
 * @param upper an upper bound for the random numbers generated
 * @return an integer array of length 7 filled with random numbers
 */

 public static int[] fillWithRandom (int upper){
     Random rand = new Random();
     int[] arr = new int[7];

     for (int i = 0; i < 7; i++){
        arr[i] = rand.nextInt(upper) + 1;
     }

     return arr;
 }

/**
 * Write a method, printArray, that takes an integer array {@code arr} and 
 * prints the contents of the array. Your method should output a newline 
 * once you've printed the contents.
 * 
 * @param arr The array of integer to be printed
 */

 public static void printArray (int[] arr){
     for (int i = 0; i < arr.length; i++){
        System.out.println(arr[i] + " ");
     }

     System.out.println("");
 }

 public static void main(String[] args) {
    int[] values = fillWithRandom(7);

    printArray(values);
    
    Arrays.sort(values);
    
    printArray(values);
 }
}
