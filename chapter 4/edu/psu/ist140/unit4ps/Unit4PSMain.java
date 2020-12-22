package edu.psu.ist140.unit4ps;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author andrew maier
 */
public class Unit4PSMain {
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Question 1: Currency conversion
        //  Write some code that first asks the user to type the current
        //  conversion rate for 1 U.S. Dollar (USD) to 1 Euro. Next, in a while
        //  loop, ask users for an amount in USD, read it in, and convert it to
        //  Euro, printing as you go. Use 0 as a sentinel (i.e.: a signal to
        //  stop the loop).
        //  Here's a sample run:
        //    Whats the current conversion rate for 1 USD to 1 Euro:
        //    .85
        //    Enter an amount in USD:
        //    10.0
        //    10.0 in USD is equal to 8.5 Euro
        //    Enter an amount in USD:
        //    2.0
        //    2.0 in USD is equal to 1.7 Euro
        //    Enter an amount in USD:
        //    0
        //    Quitting...
        
        System.out.print("Enter the USD to EUR conversion rate: ");
        double convRate = in.nextDouble();
        double amount = 1;
        while(amount != 0){
            System.out.print("Enter an amount in USD: ");
            amount = in.nextDouble();
            if (amount != 0){
            System.out.print(amount + " in USD is equal to ");
            System.out.printf("%.2f",(amount * convRate));
            System.out.println(" Euro.");
            }
        }
        System.out.println("Quitting...");
        System.out.println("\n");
        
        //Question 2: Password checker
        //  Write code to read a string (a password) from the user and then
        //  check that the password conforms to the following password policy:
        //        1) the password must be at least 8 characters
        //        2) the password must contain at least two upper case letters
        //        3) the password must contain at least one digit
        //        4) the password cannot begin with a digit
        //
        //  Use a while loop to step through the string to check these policy
        //  conditions. Output "Password OK" if the password conforms,
        //  otherwise output "Password does not conform to the policy."
        
        System.out.print("Please enter a password: ");
        String password = in.next();
        boolean cond1 = false;
        boolean cond2 = false;
        boolean cond3 = false;
        boolean cond4 = false;
        int i2 = 0;
        int numUppercase = 0;
        int numDigits = 0;

        while (i2 < password.length()){
            char currentLetter = password.charAt(i2);
            if (Character.isUpperCase(currentLetter)){
                numUppercase++;
            }
            if (Character.isDigit(currentLetter)){
                numDigits++;
            }
            i2++;
        }

        if (password.length() > 8){
            cond1 = true;
        }

        if (numUppercase >= 2){
            cond2 = true;
        }

        if (numDigits >= 1){
            cond3 = true;
        }

        if (!(Character.isDigit(password.charAt(0)))){
            cond4 = true;
        }

        if (cond1 && cond2 && cond3 && cond4){
            System.out.println("Password OK.");
        } else {
            System.out.println("Password does not conform to the policy.");
        }

        System.out.println("\n");

       
        
        //Question 3: Movie-ticket-tracker
        //  Write some code to pre-sell a limited number of movie tickets. Each
        //  buyer can buy as many as 6 tickets. No more than 20 tickets can be
        //  sold. Prompt the user for the desired number of tickets and then
        //  display the number of remaining tickets. Repeat until all tickets
        //  have been sold, and then display the total number of buyers.
        
        
        int ticketsLeft = 20;
        int buyTix;
        while (ticketsLeft > 0){
            System.out.print("Please enter the number of tickets you would like to buy: ");
            buyTix = in.nextInt();
            while (buyTix > 6){
                System.out.print("Sorry, you can buy a maximum of 6 tickets. \n Please re-enter the number of tickets you would like to buy: ");
                buyTix = in.nextInt();
            }
            ticketsLeft = ticketsLeft - buyTix;
            while (ticketsLeft < 0) {
                ticketsLeft += buyTix;
                System.out.print("You cannot buy " + buyTix + " tickets. \n Please enter a number less than or equal to " + ticketsLeft + " tickets: ");
                buyTix = in.nextInt();
                ticketsLeft -=buyTix;
            }
            System.out.println("There are " + ticketsLeft + " tickets remaining.");
        }
        
        System.out.println("\n");

        //Question 4: Restaurant-simulation
        //  You need to control the maximum number of people who can be in a
        //  restaurant at any given time. A group cannot enter the restaurant
        //  if they would make the number of people exceed 100 occupants. Use
        //  random numbers between 1 and 20 to simulate groups arriving to the
        //  restaurant. After each random number, display the size of the group
        //  trying to enter and the number of current occupants. As soon as the
        //  restaurant holds the maximum number, output that the restaurant is
        //  full and quit. NOTE: Use the java.util.Random to generate the arriving
        //  group size (don't have the user enter anything)
        //
        //  Here is a sample run of mine:
        //      Party of 13 arriving..
        //          (current occupancy is: 0)
        //      Party of 7 arriving..
        //          (current occupancy is: 13)
        //      Party of 2 arriving..
        //          (current occupancy is: 20)
        //      Party of 11 arriving..
        //          (current occupancy is: 22)
        //
        //      * .. SKIPPING TO THE END HERE .. *
        //
        //      Party of 6 arriving..
        //          (current occupancy is: 99)
        //          (arriving party too big.. turning them away)
        //      Party of 1 arriving..
        //          (current occupancy is: 99)
        //          (restaurant is now at full occupancy)
        //          (quitting...)
        
        int partySize = 0;
        Random gen = new Random();
        while (partySize < 100){
            int currParty = gen.nextInt(20);
            System.out.println("Party of " + currParty + " is arriving...");
            
            if (partySize + currParty < 100){
                System.out.println("    (current occupancy is: " + partySize + ")");
                partySize += currParty;
            } else if (partySize == 99) {
                System.out.println("    (current occupancy is: " + partySize + ")");
                System.out.println("    (arriving party too big. turning them away)");
                System.out.println("Party of 1 arriving...");
                System.out.println("    (current occupancy is: " + partySize + ")");
                partySize++;
            } else {
                System.out.println("    (current occupancy is: " + partySize + ")");
                System.out.println("    (arriving party too big. turning them away)");
            }
        }
        System.out.println("    (restauraunt is now at full capacity...)\n      (quitting...)");

        System.out.println("\n");
        
        //Question 5: Multiplication-madness
        //  Write some Java code that uses nested for loops to print a
        //  multiplication table that looks like the one shown on the problem
        //  set 4 page on canvas. Be sure to include the table headings and
        //  separators as shown.
        //
        //  Hint: to get the columns right-aligned as shown
        //        in the picture, consider using System.out.printf(..) with 3 
        //        spaces of padding
        
        
        System.out.print("* |");
        for (int d = 1; d <=9; d++){
            System.out.printf("%3d",d);
        }
        System.out.print("\n------------------------------");
        for (int i = 1; i<=9; i++){
            System.out.println("");
            System.out.print(i + " |");
            for (int j = 1; j<=9; j++){
                
                System.out.printf("%3d",i*j);
            }
        }

    }
    
}
