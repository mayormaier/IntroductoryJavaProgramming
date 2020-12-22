import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Unit7Test {

    // Question 1: 6pts
    //
    // Write a method called getLatestTestGrades that takes an integer,
    // classSize, and returns an arraylist of string. The method should first
    // check if the classSize passed is 0 or negative (if so, throw an
    // IllegalArgumentException).
    //
    // Inside the method, declare an array list of string called result and a
    // random number generator. Next create a loop that iterates classSize
    // number of times. Inside the loop, generate a random number between
    // 0..5 (exclusive) and convert this number to a string letter grade,
    // where:
    // 0 means "A"
    // 1 means "B"
    // 2 means "C"
    // 3 means "D"
    // 4 means "F"
    // You can use a switch statement or an if-elseif statement to do this. Once
    // the number is converted to a string, add it to the result arraylist. Return
    // the arraylist.

    public static ArrayList<String> getLatestTestGrades(int classSize) throws IllegalArgumentException {
        ArrayList<String> result = new ArrayList<>();
        if (classSize <= 0) {
            throw new IllegalArgumentException("invalid Class Size. must be a postitive number.");
        }

        Random rand = new Random();
        for (int i = 0; i < classSize; i++) {
            int numToAdd = rand.nextInt(5);

            switch (numToAdd) {
                case 0:
                    result.add("A");
                    break;
                case 1:
                    result.add("B");
                    break;
                case 2:
                    result.add("C");
                    break;
                case 3:
                    result.add("D");
                    break;
                case 4:
                    result.add("F");
                    break;
                default:
                    break;
            }

        }

        return result;
    }

    // Question 2: (5pts)
    //
    // Write a method called writeGrades that takes a string, fileName, and an
    // arraylist of string containing letter grades. The method returns nothing,
    // but should write the lettergrades to a file called fileName. Catch any
    // exception that might be thrown in the process of doing this.

    public static void writeGrades(String fileName, ArrayList<String> grades) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(fileName);
            for (String data : grades){
                writer.println(data);
            }
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            System.out.println(message);
        } finally {
            if (writer != null) {writer.close();}
        }
    }

    // Question 3: (5pts)
    //
    // Write a method, readGrades, that takes a string, fileName, and reads the
    // letter grades in fileName into an arraylist of string and returns it.
    // Thus the method should return an arraylist of string.
    //
    // Your method should also catch any exceptions that may arise
    // (namely: a FileNotFoundException).

    public static ArrayList<String> readGrades (String fileName){
        File inputFile = new File(fileName);
        ArrayList<String> output = new ArrayList<>();
        Scanner in = null;
        try {
            in = new Scanner(inputFile);
            while (in.hasNextLine()){
                output.add(in.nextLine());
            }
        } catch (FileNotFoundException e) {
            String err = e.getMessage();
            System.out.println(err);
        } finally {
            if (in != null){in.close();}
        }

        return output;
    }


    // Question 4: (4pts)
    //
    // Why does java not require you (the programmer) to add a "throws" clause
    // to the method header for getLatestTestGrades(..) even though it can
    // potentially throw an IllegalArgumentException?

    /*
    Java does not require you to add a throws clause to that method because the potential IllegalArgumentException that could
    arise is an unchecked exception, thus the resulting exception would not prevent the program from compiling, as it is not
    checked for at compile time. 
    */

    public static void main(String[] args) {
        String gradesFilename = "recentgrades.txt";

        //Uncomment the code below as you complete your methods
        ArrayList<String> grades = getLatestTestGrades(10);
        writeGrades(gradesFilename, grades);
        ArrayList<String> latestGrades = readGrades(gradesFilename);

        System.out.println("Latest test grades (sorted): ");
        Collections.sort(latestGrades);
        System.out.println(latestGrades);
    }
}

   
