package edu.psu.ist140.u4inclass;

import java.util.Random;

// author Andrew Maier
public class Unit4InClass {
    public static void main(String[] args) {
        // A drunk person leaves the bar and (somehow) decides it's time go
        // home. Think of the city as a grid of streets and the person
        // stumbles from one intersection to the next, randomly picking one of
        // four directions at each intersection (north, south, east, or west).
        //
        // You might think that, on average, the person won't move very far
        // (as randomness will surely cancel-out the person's alcohol-induced
        // choice), but that is actually not the case.
        //
        // Represent locations (intersections) as integer pairs (x, y) and
        // simulate a drunk person's walk over 100 intersections, starting
        // from location (0, 0) and print the ending location. Use a while loop
        // and a switch statement in your solution.
        //
        // Lastly, using the x and y coordinates of the ending location,
        // compute the Euclidean (i.e.: straight-line) distance the person
        // stumbled. Here's the relevant formula:
        // distanceStumbled = sqrt(x^2 + y^2).
        //
        // Here's some sample output from my simulation:
        //      The person ended at location: (16, 10)
        //              and stumbled (in euclidean distance): 18.87
        //
        // Hint: You can declare and use a random number generator in Java as follows:
        //          Random rand = new Random();
        //          int dir = rand.nextInt(4) + 1;  <- generate a random number between 1..4
        //                             (the + 1 here is to make the lower bound starts at 1)

        Random rand = new Random();
        int locX = 0;
        int locY = 0;

        for (int i=0; i < 100; i++){
            int choice = rand.nextInt(4) + 1;
            //for choice: 1= move north, 2= move east, 3= move south, 4= move west
            if (choice == 1){
                locY++;
            } else if (choice == 2){
                locX++;
            } else if (choice == 3){
                locY--;
            } else {
                locX--;
            }
        }

        System.out.print("The person ended at (" + locX + "," + locY + ") and stumbled "); 
        System.out.printf("%.2f\n" , Math.sqrt(Math.pow(locX, 2) + Math.pow(locY, 2)));  
    }
}
