import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class IST140Final {

    //generates an Integer array filled with 3 random number (One for each period in a hockey game)
    //Takes: no paramaters
    //Retun: int[]
    public static int[] generateArrayScores() {
        int[] scores = new int[3];

        Random rand = new Random();
        for (int i = 0; i < scores.length; i++) {
            scores[i] = rand.nextInt(5) + 1;
        }

        return scores;
    }

    //writes an integer array to a text file
    //Takes: int[]
    //Reurns: String (filename)
    public static String writeToFile(int[] scores) {
        final String filename = "ScoresArray.txt";
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(filename);
            for(int i : scores){
                writer.println(i);
            }
        } catch (FileNotFoundException e) {
            String err = e.getMessage();
            System.out.println(err);
        } finally {
            if (writer != null){
                writer.close();
            }
        }

        return filename;
    }

    //converts a text file of integers into an ArrayList of Integers
    //Takes: string (filename
    //Returns: ArrayList<Integer>
    public static ArrayList<Integer> readFile(String filename){
        ArrayList<Integer> scores = new ArrayList<>();
        File input = new File(filename);
        Scanner in = null;
        try {
            in = new Scanner(input);
            while (in.hasNextLine()){
                    int temp;
                    temp = Integer.parseInt(in.nextLine());
                    scores.add(temp);
            }
        } catch (FileNotFoundException e) {
            String err = e.getMessage();
            System.out.println(err);
        } finally {
            if (in != null){
                in.close();
            }
        }

        return scores;
    }

    //prints a histogram from an arraylist of Integers
    //Takes: ArrayList<Integer>
    //Returns: n/a
    public static void printChart(ArrayList<Integer> scoresList){
        System.out.println("Period  Goals");
        int largest = 0;
        for (int i = 0; i < scoresList.size(); i++){
            System.out.print(i+1 + "       ");
            for (int j = 0; j < scoresList.get(i); j++){
                System.out.print("*");
            }
            System.out.println();

            if (scoresList.get(i) > scoresList.get(largest)){
                largest = i;
            }

            
        }
        System.out.println("\nIn period " + (largest+1) + " the most points were scored.");
    }
    public static void main(String[] args) {
        int scoreVals[] = generateArrayScores();
        String fileName = writeToFile(scoreVals);
        ArrayList<Integer> dataVals = readFile(fileName);
        printChart(dataVals);
    }
}