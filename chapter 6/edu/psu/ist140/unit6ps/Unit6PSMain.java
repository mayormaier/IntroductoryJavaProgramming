package edu.psu.ist140.unit6ps;

import java.util.ArrayList;
import java.util.Random;



public class Unit6PSMain {
    
    /**
     * Question 1: warm up
     * <p>
     * Write a method, allSame, that takes three integers x, y, and z and
     * returns {@code true} if they are all exactly equal; {@code false} 
     * otherwise. Try to implement this method in exactly one line.
     * <p>
     * Write a method, inAscOrd, that takes an array list a of integer and
     * returns {@code true} if each element is <em>STRICTLY LESS THAN</em> the
     * next one; {@code false} otherwise. 
     */
    
    public static boolean allSame (int x, int y, int z){
        if (x == y && y == z && z == x){
            return true;
        } else {return false;}
    }

    public static boolean inAscOrd(ArrayList<Integer> values){
        boolean result = true;
        for (int i = 0; i < values.size()-1; i++){
            if (values.get(i) > values.get(i+1)){
                result = false;
            }
        }
        return result;
    }
    
    /**
     * Question 2: leavin' nums
     * <p>
     * Write a method called ileave that takes an array list a of Integer, and
     * an array list b of Integer and returns a new list with the contents of 
     * lists a and b alternated. For example, if a holds
     *   <pre>1,  4,  9,  16</pre>
     * and b holds:
     *   <pre>10,  8,  12,  17,  20,  0</pre>
     * then the method should return a new list containing:
     *   <pre>1,  10,  4,  8,  9,  12,  16,  17,  20,  0</pre>
     * You'll need to use a loop for this problem.
     * <p>
     * <strong>NOTE:</strong> do not modify the input array lists; rather,
     * build up a new array list and return that. To give you a rough estimate of
     * how much work this method should be: it can be implemented in less
     * than ~14 lines of code counting blank lines.
     */
    
     public static ArrayList<Integer> ileave (ArrayList<Integer> a, ArrayList<Integer> b){
         ArrayList<Integer> leave = new ArrayList<Integer>();
         int largest;
         if (a.size() > b.size()){
            largest = a.size();
         } else {largest = b.size();}
         for (int j = 0; j < largest; j++){
             if (j < a.size()){leave.add(a.get(j));}
             if (j < b.size()){leave.add(b.get(j));}
         }
         return leave;
     }
    
    /**
     * Question 3: matching contents
     * <p>
     * Write a method, occMatch, that takes two array lists of integer a and b.
     * Each list may only contain numbers from 1..7. The method should return
     * true if each list contains the same number of occurrences of the integers
     * 1..7 (return false otherwise).
     * <p>
     * For example:
     * if  a contains 1,  4,  2,  1,  1,  7,  4  and
     *     b contains 1,  1,  4,  1,  7,  4,  2
     * then the method should return true (as a and b each contain three 1's,
     * one 7, two 4's, etc). Return false if there is a mismatch.
     * <p>
     * <strong>NOTE:</strong> you may only use the array list methods "get" and
     * "size" to implement this (you can also declare and use normal arrays).
     */
    
     public static boolean occMatch (ArrayList<Integer> a, ArrayList<Integer> b){
         boolean isSame = true;
         int[] aOcc = new int[7];
         int[] bOcc = new int[7];
         for (int j = 0; j < 7; j++){
            for (int i = 0; i < a.size(); i++){
                if (a.get(i) == j+1){
                    aOcc[j] += 1;
                }
                if (b.get(i) == j+1){
                    bOcc[j] += 1;
                }
            }
         }

         for (int k = 0; k < 7; k++){
             if (aOcc[k] != bOcc[k]){
                 isSame = false;
             }
         }
         
         return isSame;
     }

        /**
     * Question 4: jumbling
     * <p>
     * Write a method, jumble, that takes a string, sentence (i.e. it can
     * contain white space), and returns a jumbled version where every word in
     * the sentence has correct (unchanged) first and last chars, but two
     * randomly chosen chars in the middle flipped.
     * <p>
     * Here's an example. Suppose the sentence passed is:
     * <pre>"I don't give a damn for a man that can only spell a word one way."</pre>
     * your method should return a jumbled string like this:
     * <pre>"I dn'ot gvie a dman for a man taht can olny sepll a wrod one way."</pre>
     * <p>
     * Notice that the jumbled version remains (somewhat) still readable! Anyways,
     * as shown, your method should randomly select two chars out of each word
     * of appropriate length and swap their positions in the string (you should
     * be able to infer the appropriate length from the above example).
     
     */
    
     public static String jumble (String original){
        ArrayList<String> words = new ArrayList<String>();
        ArrayList<String> jumbledWords = new ArrayList<String>();
        Random rand = new Random();

        int startIndex = 0;
        int stopIndex;
        for (int i = 0; i < original.length(); i++){
            if (Character.isWhitespace(original.charAt(i))){
                stopIndex = i;
                words.add(original.substring(startIndex, stopIndex));
                startIndex = i + 1;
            }

            if (i == original.length()-1){
                words.add(original.substring(startIndex));
            }
        }

        for (String s : words){
            if (s.length() > 3){
                char first = s.charAt(0);
                char last = s.charAt(s.length()-1);
                String middle = s.substring(1, s.length()-1);

                int a = rand.nextInt(middle.length());
                int b = rand.nextInt(middle.length());

                jumbledWords.add(first + swapCharsIn(middle, a, b) + last);
            } else {
                jumbledWords.add(s);
            }
        }
        String output = "";
        for (String w : jumbledWords){ 
             output += w + " ";
        }
        
        return output;
     }
    
    /**
     * A helper method that takes a string {@code s} and swaps the characters
     * for it located at indices {@code i} and {@code j}
     * (it's ok if {@code i == j}).
     *
     * @param s the source string
     * @param i, j indices for the characters to be swapped
     * @return a copy of s with the specified chars swapped
     */
    public static String swapCharsIn(String s, int i, int j) {

        if (i < 0 || j < 0) {
            throw new IllegalArgumentException("Can only pass positive " +
                    "(or zero) indices for i and j");
        }

        StringBuilder result = new StringBuilder(s);
        result.setCharAt(i, s.charAt(j));
        result.setCharAt(j, s.charAt(i));

        return result.toString();
    }
    
    public static void main(String[] args) {
        //call question 1 methods(s) with test input here
        ArrayList<Integer> testNums = new ArrayList<Integer>();
            testNums.add(3); testNums.add(4); testNums.add(5);
            System.out.println(inAscOrd(testNums));
        System.out.println(allSame(3, 3, 3));

        //call question 2 methods(s) with test input here
        ArrayList<Integer> numsA= new ArrayList<Integer>();
            numsA.add(8); numsA.add(7); numsA.add(3); numsA.add(9);
        ArrayList<Integer> numsB = new ArrayList<Integer>();
            numsB.add(6); numsB.add(5); numsB.add(0);

        ArrayList<Integer> leavedNums = ileave(numsA, numsB);

        for (int values: leavedNums){
            System.out.print(values + " ");
        }

        System.out.println();
        //call question 3 methods(s) with test input here
        ArrayList<Integer> aList1 = new ArrayList<Integer>();
            aList1.add(1);
            aList1.add(4);
            aList1.add(2);
            aList1.add(1);
            aList1.add(1);
            aList1.add(7);
            aList1.add(4);

        ArrayList<Integer> aList2 = new ArrayList<Integer>();
            aList2.add(1);
            aList2.add(1);
            aList2.add(4);
            aList2.add(1);
            aList2.add(7);
            aList2.add(4);
            aList2.add(2);
        
        System.out.println(occMatch(aList1, aList2));
        
        //call question 4 methods(s) with test input here

        System.out.println(jumble("the quick brown fox jumped over the lazy dog")); 
    }
    
}
