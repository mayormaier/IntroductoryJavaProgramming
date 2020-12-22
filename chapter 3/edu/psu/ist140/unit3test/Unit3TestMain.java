package edu.psu.ist140.unit3test;

import java.util.Scanner;

public class Unit3TestMain {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        /*
         Question 1 (5pts). 

         Write some Java code that prompts the user to enter a non-empty string.
         Read the string in and store it in a string variable. Then declare a
         boolean variable and set it to true if the first character of the read
         in string is upper case. Once you're done, output:
            "Is the first character in upper case?"
         then print value of your boolean variable. 
         */     

         System.out.print("Eneter a non empty string: ");

         String input;
         boolean determine
         if (in.hasNext()){
             input = in.next();
             if (Character.isUpperCase(input.charAt(0)){
                 determine = true;
             }
             
             System.out.println("s the first character in upper case? \n" + determine);

         } else {
             System.out.println("Please enter a valid input.");
             System.exit(0);
         }


        /*
         Question 2 (3pts):
         
         What does the following boolean expression evaluate to: true or false?

          ( ( ((40 < 200) && (110 < 100)) || (250 >= 250) )  && !!true ) && !false

         In order to receive partial credit if your answer is wrong, break the
         overall expression down into sub-expressions and show the true or
         false value for each sub-expression.

         For example: (40 < 200) is a sub-expression with a true/false value
         of ___ <- write (true or false) here; do this until the value of the
         entire expression is known.
         */        
        /*
         Question 3 (2pts):
         
         Point out the problem with the following (useless) code fragment.
         Assume here that str is a string, x is an int and both have been
         initialized:
           if (str == "Jerry") {
               System.out.println("MOOO");
           }
           else if (x == 46) { ..
               System.out.println("GOOO");
           }
         How should one go about fixing it? Write your answer in this comment.
         */

        /*
         Question 4 (5pts)
         
         First declare three integer variables x, y, z and initialize each of
         them to zero. Next, prompt the user to enter values for x, y, and z
         using the scanner. You should validate that the user indeed entered
         integers using the appropriate scanner method.

         If the user entered invalid input: print an error, else:
         write an algorithm to find the minimum among the inputs x, y, and z
         and print a message when finished: "Minimum is: m" where 'm' is the min
         Note: don't use Math.min(..) or Math.max(..) for this problem.
         */
        
        /*
         Question 5 (2pts).

         Prompt the user to enter an integer from 1 to 3. Use a switch/case
         statement to determine the month starting, where January is one, etc.
         (You can store the month in a string). Use April as the default.

         Output "The month is: " followed by the month.
         */ 

        /*
         Question 6 (3pts).

         Prompt the user to read in 3 integers x2, y2, and z2.
         Print "all the same" if they are all equal, "all different" if they are
         all different, and "neither" otherwise.
         */
    }
}