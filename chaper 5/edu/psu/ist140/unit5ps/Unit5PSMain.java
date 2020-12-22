package edu.psu.ist140.unit5ps;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;





/**
 *
 * @author Andrew Maier
 */
public class Unit5PSMain {
    
    public static void main(String[] args) {

        Random gen = new Random();
        Scanner in = new Scanner(System.in);
       
        // Question 1: Warm up
        //
        // Write a code snippet that initializes an array with ten random
        // integers (between 1..20) and then prints the following output:
        //   a. every element (on a single line)
        //   b. every element at an even index (on a single line)
        //   c. every even element (on a single line)
        //   d. all elements in reverse order (on a single line)
        //   e. only the first and last elements (on a single line)
        //
        // Here's some sample output from my run:
        //  a:  4 20 1 19 12 8 20 9 18 2
        //  b:  4 1 12 20 18
        //  c:  4 20 12 8 20 18 2
        //  d:  2 18 9 20 8 12 19 1 20 4
        //  e:  4 2
        
        int[] randNums = new int[10];
        for (int i = 0; i < randNums.length; i++){
            randNums[i] = gen.nextInt(20) + 1;
        }
        System.out.print("a:  ");
        for (int j = 0; j < randNums.length; j++){
            System.out.print(randNums[j] + " ");
        }
        System.out.print("\nb:  ");
        for (int k = 0; k < randNums.length; k+=2){
            System.out.print(randNums[k] + " ");
        }
        System.out.print("\nc:  ");
        for (int l = 0; l < randNums.length; l++){
            if (randNums[l]%2 == 0){
            System.out.print(randNums[l] + " ");
            }
        }
        System.out.print("\nd:  ");
        for (int m = randNums.length-1; m >= 0; m--){
            System.out.print(randNums[m] + " ");
        }
        System.out.print("\ne:  ");
        System.out.print(randNums[0] + " " + randNums[randNums.length-1]);

        System.out.println("\n\n");
        
        // Question 2: Tagging runs
        //
        // A run is a sequence of adjacent repeated values. Write a code
        // snippet that generates a sequence of 20 random die tosses in an
        // array and that prints the die values, marking the runs by including
        // them in parentheses, like this:
        //  1 2 ( 5 5 ) 3 1 2 4 3 ( 2 2 2 2 ) 3 6 ( 5 5 ) 6 ( 3 3 )
        //
        // To get started: first, declare an array called values of length 20
        // and fill each slot with a random number between 1..6 inclusive
        // (use Random() for this).
        //
        // Next, to mark runs, use the following pseudocode:
        //
        // inRun = false
        // for each valid index i in the array do
        //    if inRun
        //       if values[i] is different from the preceding value
        //          print ")"
        //          inRun = false
        //       end
        //    end
        //    if not inRun
        //      if i + 1 is less than values.length()
        //             AND values[i] is the same as the following value
        //          print "("
        //          inRun = true
        //       end
        //    end
        //    print " " + values[i] + " "
        // end
        // if inRun then print ")" end
        
        int[] values = new int[20];

        for (int o = 0; o < values.length; o++){
            values[o] = gen.nextInt(6) + 1;
        }

        boolean inRun = false;
        for (int p = 0; p < values.length; p++){
            if (inRun){
                if (values[p] != values[p - 1]){
                    System.out.print(" )");
                    inRun = false;
                }
            }
            if (!inRun){
                if ((p + 1 < values.length) && (values[p] == values[p+1])){
                    System.out.print(" (");
                    inRun = true;
                }
            }
            System.out.print(" " + values[p]);
            
        }

        if (inRun){
            System.out.print(" )");
        }
        
        System.out.println("\n");
        


        // Question 3: Seating price chart
        //
        // Implement a theater seating chart as a two-dimensional array of
        // seat prices, like this:
        //    {10, 10, 10, 10, 10}
        //    {10, 10, 20, 20, 20}
        //    {20, 40, 40, 40, 50}
        //    {50, 50, 40, 30, 50}
        //
        // First initialize this 2d array and print it out (render the grid
        // with 3 spaces of padding between each seat price).
        //
        // Next, initialize a flag lookingForSeat and set it to true
        // Next, write a while loop following this general procedure:
        // while true do:
        //    Prompt the user to enter an integer 1 or 2.
        //    If they chose 1, prompt them to choose a specific row 1..4
        //    and a seat number 1..5 (within the row). First check that the
        //    seat identified is valid (i.e.: that row and column typed are non-negative, etc.)
        //    If the seat they identified is already purchased (i.e.: grid[row][seat #] == 0) then
        //    tell them the seat is filled, otherwise seat them and mark the
        //    seat as sold by setting its cell to zero.
        //
        //    If they choose 2, prompt them for the price they wish to spend on
        //    a seat ($10, $20, $30, $40, or $50) then find the (row, col) index
        //    of an available seat at the price specified and mark it as
        //    sold. If there is no such seat available at that price,
        //    print "no seats remaining at that price"
        //
        //    If they choose a number greater than 2, print invalid option
        //
        //    If they enter 0 or any negative number stop the loop
        //
        //    At the end of each iteration, render the grid with 3 spaces of
        //    padding between each seat price (to show the current state of 
        //    the seating area)
        //
        // Here is a sample run:
        //   10 10 10 10 10
        //   10 10 20 20 20
        //   20 40 40 40 50
        //   50 50 40 30 50
        // Do you wish to choose a seat by location (1) or price (2)?
        // 1
        // Enter a row (1..4) and seat number (1..5)
        // 1
        // 1
        // Here's your seat
        //   0 10 10 10 10
        //  10 10 20 20 20
        //  20 40 40 40 50
        //  50 50 40 30 50
        // Do you wish to choose a seat by location (1) or price (2)?
        // 2
        // Enter the price of a seat you'd like: 10, 20, 30, 40, or 50
        // 40
        // finding seat...
        // Found one at row: 3 seat num: 2
        //   0 10 10 10 10
        //  10 10 20 20 20
        //  20  0 40 40 50
        //  50 50 40 30 50
        
        int[][] seatPrices = {
                                {10, 10, 10, 10, 10},
                                {10, 10, 20, 20, 20},
                                {20, 40, 40, 40, 50},
                                {50, 50, 40, 30, 50}
                             };

        for (int q = 0; q < seatPrices.length; q++){
                for (int r = 0; r < seatPrices[0].length; r++){
                    System.out.printf("%3d", seatPrices[q][r]);
                }
                System.out.println();
        }

        System.out.println();

        boolean lookingForSeat = true;
        
        int seatRow = 0;
        int seatNum = 0;
        int temp = 0;

        while (lookingForSeat){

            
            int decision = 0;
            boolean error = false;
            System.out.print("Please enter \"1\" to find seat by location or \"2\" to find seat by price: ");
            decision = in.nextInt();

            if (decision == 1){
                System.out.print("Please enter the seat row (1-4): ");
                temp = in.nextInt();
                if (temp <= 4 && temp > 0){
                    seatRow = temp - 1;
                } else {
                    error = true;
                }   
                System.out.print("Plese enter the seat number (1-5): ");
                temp = in.nextInt();
                if (temp <= 5 && temp > 0){
                    seatNum = temp - 1;
                } else {
                    error = true;
                }
                if (error){
                    System.out.println("Please enter a valid selection.");
                } else {
                    if (seatPrices[seatRow][seatNum] == 0){
                        System.out.println("Sorry, the seat you chose is taken, please choose another seat.");
                    } else {
                        System.out.println("The seat at row " + seatRow + " seat " + seatNum + " will cost $" + seatPrices[seatRow][seatNum] + ". Please be seated.");
                        seatPrices[seatRow][seatNum] = 0;
                    }
                }

                
            } else if (decision == 2){
                System.out.print("Please enter your deired ticket price ($10 - $50): ");
                int price = in.nextInt();
                System.out.println("finding seat...");

                
                outerloop:
                for (int s = 0; s < seatPrices.length; s++){
                    for (int t = 0; t < seatPrices[0].length; t++){
                        if (seatPrices[s][t] == price){
                            System.out.println("seat found at row " + s + " seat " + t);
                            seatPrices[s][t] = 0;
                            for (int q = 0; q < seatPrices.length; q++){
                                for (int r = 0; r < seatPrices[0].length; r++){
                                    System.out.printf("%3d", seatPrices[q][r]);
                                }
                                System.out.println();
                            }
                            break outerloop;
                        } 
                    }
                    
                    System.out.println();

                }

            } else{
                lookingForSeat = false;
            }

            System.out.println("\n");

            for (int q = 0; q < seatPrices.length; q++){
                for (int r = 0; r < seatPrices[0].length; r++){
                    System.out.printf("%3d", seatPrices[q][r]);
                }
                System.out.println();
            }
            
            System.out.println("\n");
        }
        
        // Question 4: arrays, arraylists, and reversal
        //
        // Write some code which, given an array a of integers, copies its
        // elements in reverse order (with 5 added to each) into an ArrayList.
        // So, given the following array, arr, and an initially empty 
        // ArrayList named 'reversalList', declared as follows:
        //
        //   int[] arr = {1, 2, 3, 4};
        //   ArrayList<Integer> reversalList = new ArrayList<>();
        //
        // your algorithm after being run should print the following: 
        //     System.out.println(reversalList);
        // which should output: [9, 8, 7, 6]
        // (as this is the reverse of arr with 5 added to each element)

        int[] arr = {1, 2, 3, 4, 5};
        ArrayList<Integer> reversalList = new ArrayList<>();

        for (int w = arr.length-1; w >= 0; w--){
            reversalList.add(arr[w]+5);
        }

        System.out.println(reversalList);
    }
    
}
