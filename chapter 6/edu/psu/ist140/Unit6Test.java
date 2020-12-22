package edu.psu.ist140;

import java.util.ArrayList;
import java.util.Random;

public class Unit6Test {

    public static String mid (String inputString){
        String mid = "";
        if (inputString.length()%2 == 1){
            mid = inputString.substring(inputString.length()/2, (inputString.length()/2)+1);
            return mid;
        } else {
            mid = inputString.substring((inputString.length()/2) - 1, (inputString.length()/2) + 1);
            return mid;
        }
    }

    public static boolean mystery(int x){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        Random rand = new Random();
        boolean present = false;
        for (int i = 0; i < 10; i++){
            nums.add(rand.nextInt(4)+1);
        }

        System.out.println("this is the list");
        for (int value : nums){
            System.out.print(value + " ");
        }

        for (int j = 0; j < nums.size(); j++){
            if (nums.get(j) == x){
                present = true;
            }
        }

        return present;
    }
    

    public static void main(String[] args) {

        

        // Question 1 (5pts):
        //
        // a. for the code:
        //          public static boolean moo(int x, int y) {..}
        //          public static void main(..) {
        //              moo(5, 8);
        //          }
        //    answer the following:
        //      - what is the return type of the moo method?
                    //boolean
        //      - how many formal parameters does the moo method have and what are they named?
                    //2: x, y
        //      - list the types of the formal parameter(s).
                    //int, int
        //
        // b. as a caller of some method F, name two things that you need to know
        //    about method F in order to call it successfully (assume that you
        //    already know the name is F).
                    //you need to know the number and type of formal parameters for method F, as well as method F's return type
        //
        // c. name the type in Java indicating that a method has no return
                    //void
    
    
        // Question 2 (6pts):
        //
        // Write a method called mid that takes a string parameter, str, and
        // returns a string containing the middle character of str if it is an
        // odd length string. In the case of an even length str, return a string
        // containing the middle two chars.
        //
        // Here's are two examples:
        //      mid("noodle"); //returns "od"
        //      mid("mayor");  //returns "y"
        //
        // The method you write for this should be placed above main() where
        // it says: "Write method for question 2 here" (after you write the
        // method, call it here on some sample input, just like you did in the problem set)
        //
        // Hint: recall that str.length() % 2 == 0 will be true if the length of str
        //       is even; false if the length of str is odd

        System.out.println("This is the string: " + mid("rawr")); 
    
    
        // Question 3 (6pts):
        //
        // Write a method called mystery. INSIDE the method, declare an
        // ArrayList of Integer and fill it with 10 randomly generated
        // integers ranging from 1..4. The mystery method should take a
        // integer parameter, x, and return true if x happens to appear in the
        // randomly filled ArrayList; false otherwise.
        //
        // Write your mystery method above main() where it says:
        // "Write method for question 3 here";
        //
        // print the result of calling mystery in your main; (after you write the
        // method, call it here on some sample input, just like you did in the problem set)

        System.out.println("\n" + mystery(3));
    
        // Question 4 (3pts):
        //
        // Explain the role methods play in enabling black box abstraction (2 or 3 sentences)

        /* methods allow users to focus on what values (and their type) are passed into a method and what value comes out (and its type) 
           rather than worrying about what happens inside the method body. In other words, only the specification, what the method does,
           matters, not how it is implemented. Thus, multiple programmers can work on the same project without worrying about the internal
           inplemetation of each method. 
        */
    }

}
