package edu.psu.ist140;

import java.util.ArrayList;
import java.util.Random;

public class Unit6TestPractice {
         
        //Question 2 method(s) up here 
        public static int countWords (String sentence) {
            int words = 0;
            for (int i = 0; i < sentence.length(); i++){
                if (Character.isWhitespace(sentence.charAt(i))){
                    words++;
                }
            }

            return words + 1;
        }  
        //TODO: Question 3 method(s) up here    
        //Question 5 method(s) up here
        public static ArrayList<Integer> daFill() {
            ArrayList<Integer> fill = new ArrayList<Integer>();
            Random rand = new Random();
            for (int i=0; i < 10; i++){
                fill.add(rand.nextInt(10)+1);
            }
            return fill;
        }    
        //TODO: Question 6 method(s) up here    
        //TODO: Question 8 method(s) up here 
        public static ArrayList<Integer> removeNegs (ArrayList<Integer> full){
            for (int i = 0; i< full.size(); i++){
                if (full.get(i) < 0){
                    full.remove(i);
                }
            }
            return full;
        }   
        public static void main(String[] args) {       
             //Question 1 (R5.4): True or False        
             //        a. a method has exactly one return statement   FALSE     
             //        b. a method has to have at least one return statement   FALSE       
             //        c. a method has at most one return value     FALSE   
             //        d. a method with a return value void NEVER has a return statement    FALSE     
             //        f. a method with a return value of void MUST print something     FALSE       
             //        g. a method without parameters must always return the same value     FALSE  
             
    //Question 2 (P5.7):        
    //        
    // Write a method countWords, that takes a String str and returns a         
    // count of all words in the string str. Words are separated by spaces.        
    // for example, countWords("Mary had a little lamb") should return 5. 
    
    System.out.println(countWords("Mary had a little lamb"));
    //Question 3 (P5.3):        
    //        
    // Write the following methods:        
    // 1. a method, lastDigit, that takes an integer n as a parameter, and returns         
    //    the last digit of the parameter n.        
    // 2. a method, digits, that takes an integer n as a parameter and         
    //    returns the number of digits in n        
    //        
    // For example: lastDigit(1729) returns 9 and digits(1729) returns 4        
    //Question 4 (R6.16):        
    //
    // For the operations described below, write a method header         
    // (don't implement them -- though do it if you want the practice).        
    // a. Sort elements in decreasing order (mutate the input list)        
    // b. Count how many elements in an input array list of integer, l, are         
    //    less than a given value, val.        
    //        
    // a. public static void sort(ArrayList<Integer> inputList) {..}        
    // b. public static int countElement(ArrayList<Integer> l, int val) { .. }  

    //Question 5:        
    // Write a method, fillRandom, that takes nothing and fills a new array        
    // list with 10 random numbers and returns the new array list.   
    
    
    //Question 6:       
    // Write a method, join, that takes an arraylist, a, of String and a separator         
    // string sep, and returns a String of each element of the passed arraylist,         
    // delimited/joined by sep.        
    //         
    // For example if list l contains:        
    //  l = ["cat", "dog", "moo"]        
    // then         
    //  jn(l, ", ") returns "cat, dog, moo"        
    //Question 7:        
    //        
    // Name two benefits of methods.

    //they make code more readable and provide a way for users to reuse code

    //Question 8:        
    //        
    // Write a method, removeNegatives, that takes an arraylist (nums) of         
    // integer, and returns an arraylist where all negative numbers have         
    // been removed.
        }
}

