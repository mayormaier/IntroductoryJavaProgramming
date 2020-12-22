package edu.psu.ist140.unit3ps;

import java.util.Scanner;


/**
 * 
 * @author Andrew Maier
 */
public class Unit3PSMain {
    
    public static void main(String[] args) {
        
        /* Question 1.
        Write a program that translates a number between 0 and 4 into the
        closest letter grade. For example, the number 2.9 (which might
        have been the average of several grades) would be converted to C+.
        Use the grade ranges in the course syllabus. 
        
        For the sake of simplicity, consider an A to just be 4.0 
        (don't worry about A+, A-, etc.), further since the syllabus doesn't 
        consider C-, don't worry about it either.
        */
        
        Scanner in = new Scanner(System.in);
        
        
        System.out.print("Enter a numerical grade from 0 to 4: ");
        double grade = in.nextDouble();
        double pct = (grade / 4) * 100;
        pct = Math.round(pct);
        String letterGrade;
        
        if (pct >= 93){
            letterGrade = "A";
        } else if (pct >= 90){
            letterGrade = "A-";
        } else if (pct >= 87){
            letterGrade = "B+";
        } else if (pct >= 83){
            letterGrade = "B";
        } else if (pct >= 80){
            letterGrade = "B-";
        } else if (pct >= 77){
            letterGrade = "C+";
        } else if (pct >= 70){
            letterGrade = "C";
        } else if (pct >= 60){
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
        
        System.out.println("Your grade of " + grade + " coverts to a " + letterGrade);
        
        System.out.println("\n");
        
        /* Question 2.
        Write code that request's a value of type integer from the user
        (call it selection)--then validate that the user has entered an integer.
        If they have, use a switch-case statement to branch on the value using
        the following rules. If the value equals 1, output "First"; if the value
        equals 2, output "Second", otherwise output "Invalid entry".
        */
        
        System.out.print("enter your number: ");
        int selection; 

        if (in.hasNextInt() == true){
            selection = in.nextInt();
            switch(selection){
                case 1: System.out.println("First"); break;
                case 2: System.out.println("Second"); break;
                default: System.out.println("Invalid Entry"); break;
            }
        }
        
        System.out.println("\n");
        
        /* Question 3.
        When you use an automated teller machine (ATM) with your bank card,
        you need to use a personal identification number (PIN) to access your
        account. If a user fails more than three times when entering the PIN,
        the machine will block the card.

        Assume that the user’s PIN is “1234” and write a program that asks the
        user for the PIN no more than three times, and does the following:
        -> If the user enters the right number, print a message saying,
           "Your PIN is correct", and end the program.
        -> If the user enters a wrong number, print a message saying,
           "Your PIN is incorrect" and, if you have asked for the PIN less than
           three times, ask for it again.
        -> If the user enters a wrong number three times, print a message
           saying "Your bank card is blocked" and end the program.
        */
        
        int count = 0;
        int pin;

        while (count < 3){
            System.out.print("Please enter your PIN: ");
            pin = in.nextInt();

            if(pin == 1234){
                System.out.println("your pin is correct");
                count = 10;
            } else {
                System.out.print("your pin is incorrect. ");
                if (count < 2){
                    System.out.println("please try again.");
                } else {
                    System.out.println("you have entered an incorrect password too many times. your account is locked.");
                }
                count++;
            }

        }

        System.out.println("");
        
        /* Question 4.
        Write a Java snippet to accept a single character from the user.
        Output all of the statements that are true about the character X:
        X is a letter, X is a digit, X is white space, X is upper case, X is
        lower case, X is unknown.

        Hint 1: there is no scanner method that reads and produces a single
                character from the keyboard. Instead, use next() to obtain a
                string containing the desired character, then retrieve the
                character using an appropriate method from the String class..
        Hint 2: the Character class (with a capital C) has static methods that
                you can call that will tell you if a given char is a letter,
                digit, whitespace, etc.
        Hint 3: A good way of determining whether a character c is unknown or
                not is via Character.isDefined(..)
        */
        Scanner in2 = new Scanner(System.in);

        System.out.print("Enter a character: ");
        String input4 = in2.nextLine();
        char subject = input4.charAt(0);

        boolean determine = Character.isDefined(subject);
        if (determine == true){
            System.out.println("character " + subject + " is defined.");
        } else {
            System.out.println("character " + subject + " is unknown.");
        }

        determine = Character.isDigit(subject);
        if (determine == true){
            System.out.println("character " + subject + " is a digit.");
        }

        determine = Character.isLetter(subject);
        if (determine == true){
            System.out.println("character " + subject + " is a letter.");
        }

        determine = Character.isWhitespace(subject);
        if (determine == true){
            System.out.println("character " + subject + " is whitespace.");
        }
        
        determine = Character.isUpperCase(subject);
        if (determine == true){
            System.out.println("character " + subject + " is upper case.");
        }

        determine = Character.isLowerCase(subject);
        if (determine == true){
            System.out.println("character " + subject + " is lower case.");
        }    
    }
}
