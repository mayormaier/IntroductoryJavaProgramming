package edu.psu.ist140.unit5ps;

import java.util.ArrayList;
import java.util.Arrays;


public class Unit5TestMain {
    
    public static void main(String[] args) {
        // Question 1 (5pts total).
    //  a. What is wrong with the following line of code:   (1pt)
    //      ArrayList<int> vals = new ArrayList<int>();
    //  b. What is an index, what are legal index values, and what is a
    //     bounds error? (2pts)
    //  c. Suppose A is an array of 10 elements and B is an ArrayList
    //     containing some unknown number of elements.
    //     What is the distinction between saying data.length and B.size()? (2pts)

    //  a) You cannot declare an array list to hold primitave types. If you want to create an array list of 
    //     integers, you should use the wrapper Integer in the declaration:
    //     ArrayList<Integer> vals = new ArrayList<Integer>();
    //  b) An index is a number that references the position of an element in an array or array list. 
    //     Legal index vales range from 0 to one less than the length of the array. A bounds error is an 
    //     exception that when trying to access an element at an index that does not exist and is outside
    //     the bounds of a particular array.
    //  c) Both A.length and B.size() will return the number of elements in the array, but because A is an array
    //     and B is an Array List, there are different methods associated with each object type. Also, after the 
    //     array A is declared to have 10 elements, A.length will always return 10 and will not change. The size 
    //     of ArrayList B at the time of declaration is 0, and can change as more elements are added throughout
    //     the program.



    // Question 2 (5pts).
    // Create a one-dimensional array (type double, size 6) to store
    // numeric quiz grades. Initialize the array with the following grades:
    //  5.2, 8.9, 1.2, 3.67, 3.6, 9.4
    // Now sort the array and compute the final quiz score with the lowest
    // two scores dropped (i.e. don't compute them in the total). Output
    // the total.
    
    double[] quizGrades = {5.2, 8.9, 1.2, 3.67, 3.6, 9.4};
    Arrays.sort(quizGrades);

    double quizSum = 0;
    for (int i = 2; i < quizGrades.length; i++){
        quizSum+=quizGrades[i];
    }

    System.out.println("The sum of the quiz scores is " + quizSum);
    System.out.println("\n\n");
    


    // Question 3 (5pts).
    // Create a one-dimensional array (type String, size 4) to store pet
    // owners names and initialize it to contain the following names:
    //  Moe    May   Oli    Bob
    // Now create and initialize a two-dimensional array (type integer) to
    // store the number of dogs and cats owned, respectively. The 2d
    // 'pet' array should have 4 rows and 2 columns and should match the
    // one shown below:     (you can ignore the Dog Cat header -- it's just
    //                       there for clarity)
    //          Dog Cat
    //   Moe     0  4
    //   May     1  2
    //   Oli     0  0
    //   Bob     5  4
    //
    // First, print the table shown above using a nested loop (owners names
    // should be included on the left as shown).
    //
    // Now compute the total number of dogs and cats in the 2d array and print
    // this out AFTER the nested loop (feel free to compute this sum in the
    // same nested loop where you do the printing).
    //
    // Here's some sample output:
    //
    //   Moe  0  4
    //   May  1  2
    //   Oli  0  0
    //   Bob  5  4
    //
    //  There are 16 pets total
    
    String[] ownerNames = {"Moe", "May", "Oli", "Bob"};
    int[][] numPets = {{0,4},{1,2},{0,0},{5,4}};
    int petsTotal = 0;

    for (int j = 0; j < numPets.length; j++){
        System.out.print(ownerNames[j] + "  ");
        for (int k = 0; k < numPets[0].length; k++){
            System.out.printf("%3d",numPets[j][k]);
            petsTotal+=numPets[j][k];
        }
        System.out.println();
    }

    System.out.println("\nThere are " + petsTotal + " pets total.");
    System.out.println("\n\n");
    
    // Question 4 (2pts):
    // Part 1: Write a Java code snippet to declare an ArrayList of String.
    // Next, add the values: "Jill" and "Jack" to the ArrayList.
    // Part 2: Afterwards, declare a string variable called moo and
    // USE AN ARRAYLIST METHOD to initialize it to the very first string
    // in the ArrayList from part 1.

    ArrayList<String> names = new ArrayList<String>();
    names.add("Jack");
    names.add("Jill");

    String moo = names.get(0);
    System.out.println(moo);

    System.out.println("\n");

    // Question 5 (3pts):
    // Declare an array, data, containing the following (integer) elements:
    //  22, 33, 44, 55, 66, 77, 88
    // as you can see, the array should have a maximum length of 7.
    // Now write a for loop erases all the elements (sets them to 0). You
    // MUST use a loop in your solution (do not manually set each and every
    // index)

    int[] nums = {22, 33, 44, 55, 66, 77, 88};

    for (int z = 0; z < nums.length; z++){
        nums[z] = 0;
    }

    for (int y = 0; y < nums.length; y++){
        System.out.printf("%3d", nums[y]);
    }

    }
}
