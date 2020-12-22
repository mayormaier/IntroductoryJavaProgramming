package edu.psu.ist140.unit4test;

import java.util.Random;
import java.util.Scanner;




public class Unit4Test {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        // Question 1 (2pts):
        // Rewrite the following code to use a while loop instead of a for loop:
        // int count = 0;
        // for (int i = 1; i <= 10; i++) {
        //    count = count + i;
        // }
/*
        int count = 0;
        int i = 1;
        while (i <= 10){
            count = count + i;
            i++;
        }

        // Question 2 (3pts):
        // Write a program that reads a word (using the Scanner) and prints the
        // number of vowels in the word. For this question, assume that
        // a e i o u y are vowels. For example, if the user provides the word
        // "Harry", the program should print: "there are 2 vowels". Use a while
        // loop for this.
        
        System.out.print("Enter a word: ");
        String word = in.next();
        int position = 0;
        int vCount = 0;
        while (position < word.length()){
            if (word.charAt(position) == 'a' || word.charAt(position) == 'A' || word.charAt(position) == 'e' || 
            word.charAt(position) == 'E' || word.charAt(position) == 'i' || word.charAt(position) == 'I' || 
            word.charAt(position) == 'o' || word.charAt(position) == 'O' || word.charAt(position) == 'u' ||
            word.charAt(position) == 'U' || word.charAt(position) == 'y' || word.charAt(position) == 'Y'){
                vCount++;
            }
            position++;
        }

        System.out.println("There are " + vCount + " vowels.");
        
        // Question 3 (5pts):
        // Write some code that reads in a string (via the scanner). Next,
        // declare a string variable called 'strReversed' and initialize it to
        // "". Now, using a while or for loop, write some code that
        // reverses the original string one char at a time, storing it in the
        // 'strReversed' variable.
        // Hint: You can concatenate strings to individual chars using '+'
        //
        // Here's some sample output: "The reverse of Cat is taC"
        
        System.out.print("Enter a word to be reversed: ");
        String word2 = in.next();
        String strReversed = "";

        for (int j = word2.length()-1; j >= 0; j--){
            strReversed = strReversed + word2.charAt(j);
        }
        System.out.println("The reverse of " + word2 + " is " + strReversed);
        
        // Question 4 (5pts):
        // Write some code that uses a nested for loop to
        // print 3 rows of 6 random integers between 1 and 9 inclusive.
        // Hint: you'll need a new instance of a random number generator for
        //       this problem; it can be instantiated by saying:
        //       Random rand = new Random();
        // Here's some sample output:
        //  3 5 2 1 4 9
        //  1 1 9 7 4 2
        //  8 5 5 2 8 1
        
        Random rand = new Random();

        for(int k = 0; k < 3; k++){
            for (int m = 0; m < 6; m++){
                System.out.print((rand.nextInt(9) + 1)+ " ");
            }
            System.out.println("");
        }
        */
        // Question 5 (3pts):
        // Write some code that finds and returns the index of the first
        // occurrence of a char (key) in a sentence. Use a sentinel or a break
        // statement to exit the loop once the first occurrence is found.
        //
        // Use the scanner to read in both the sentence being searched the
        // character that you want to find the first index / occurrence of.
        //
        // Here's a sample run:
        //  Enter a sentence: "the quick brown fox jumped"
        //  Enter a key char: "o"
        //  o occurs at index 12

        System.out.print("Enter a sentence: ");
        String sentence = in.nextLine();
        int pos = 0;
        
        char lookup = 'o';
        
        while (!(Character.isDigit(lookup))){
            System.out.print("Enter a char, use 0 to stop: ");
            String ind = in.next();
            lookup = ind.charAt(0);
            for (int n = 0; n < sentence.length(); n++){
                if(lookup == sentence.charAt(n)){
                    pos = n;
                    System.out.println(lookup + " occurs at index " + pos);
                    break;
                }
            }
            
        }

        // Question 6 (2pts):
        // When should a do-while loop be used? Write your answer in the comment
        // below.

        //A do while loop should be used when a user wants the loop to run one time through, without being checked for a condition.
        //The user wants the conditon to be checked at the end of the first iteration.
    }
    
}
