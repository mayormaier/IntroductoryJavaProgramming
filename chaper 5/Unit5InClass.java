import java.util.Scanner;

public class Unit5InClass {
    public static void main(String[] args) {
        // In Class Assignment: Line Numbers
        //
        // In this assignment, you are to write a program that does the following:
        // 1. Prompt the user for how many lines of text they wish to enter, call this 
        //    integer variable linesOfText
        //
        // 2. Declare and initialize an array of strings to hold the user's input. 
        //
        // 3. Write a while loop that iterates linesOfText number of times. 
        //    And each iteration, you prompt the user to enter a sentence. Read this 
        //    sentence in using the scanner method nextLine(). Once the sentence 
        //    is read in, put it into the array declared in step (2) at the 
        //    appropriate index 
        //    (i.e.: this should be whatever iteration number the loop is on)
        //
        // 4. After the strings have been read, use a for loop to step through the array 
        //    of sentences and concatenate a number to the beginning of each sentence. 
        //    E.g.: Suppose we have the following strings in our array 
        //              {"A big cat..", "A big dog..", "A big mountainlion!"}
        //          after the loop it should look like:
        //              {"1 A big cat..1", "2 A big dog..", "3 A big mountainlion!"}
        //
        // 5. Lastly, use a foreach loop to print out the (numbered) sentences.

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of lines of text you are going to write: ");
        int linesOfText = in.nextInt();

        String[] text = new String[linesOfText];

        in.nextLine();
        int i = 0;
        
        while (i < linesOfText){
            System.out.print("Enter your sentence: ");
            text[i] = in.nextLine();
            i++;
        }

        for (int j = 0; j < text.length; j++) {
            text[j] = (j+1) + " " + text[j];
        }

        System.out.println("\n");
        for (String element : text){
            System.out.println(element);
        }
    }
}