import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;



public class Unit7PS {

    /*
    1. Write a method called getSongsArray that takes an integer parameter (numSongs),
    returns an array of Strings, and is declared to throw an IllegalArgumentException. If the
    parameter passed is a negative value, throw an IllegalArgumentException. Otherwise,
    loop numSongs times prompting the user to enter another name each pass through
    the loop. Return this array of names. 
    */
     
    public static String[] getSongsArray (int numSongs) throws IllegalArgumentException {
        Scanner in = new Scanner(System.in);

        if (numSongs <= 0){
            in.close();
            throw new IllegalArgumentException("invalid number of songs. please enter a postitve number.");
        }
        String[] songNames = new String[numSongs];

        for (int i = 0; i < numSongs; i++){
            System.out.print("Enter a song name: ");
            songNames[i] = in.nextLine();
        }
        in.close();
        return songNames;
    }

    /*
    2. Write a method called writeSongs that takes two parameters: an array of
    Strings (songsArray) and a String (fileName), and returns nothing. Write the
    array of Strings (songs) to a text file named using the fileName parameter.
    Make sure to catch any Exception that might be thrown.
    */

    
    public static void writeSongs (String[] songsArray, String fileName) {
        PrintWriter writer = null;

        try {
            writer = new PrintWriter(fileName);
            for (String data : songsArray){
                writer.println(data);
            }
        } catch (FileNotFoundException e) {
            String errMsg = e.getMessage();
            System.out.println(errMsg);
        } finally {
            writer.close();
        }
    }

    /*
    3. Write a method called readSongs that takes a String parameter (fileName) and
    returns an ArrayList of Strings (songsArrayList). The method reads the text file
    (fileName) and populates the ArrayList with an element for each line in the
    file. The method returns the populated ArrayList. Make sure to catch any
    Exception that might be thrown.
    */

    public static ArrayList<String> readSongs (String fileName){
        ArrayList<String> songs = new ArrayList<>();
        File inputFile = new File(SONGS_FILENAME);

        try {
            Scanner in = new Scanner(inputFile);
            while (in.hasNextLine()){
                songs.add(in.nextLine());
            }
            in.close();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            System.out.println(message);
        }
        return songs;
    }

    /*
    4. Write a method called printSongs that takes an ArrayList of Strings and
    prints the contents of the ArrayList to the command line, each on a separate
    line. 
    */

    public static void printSongs (ArrayList<String> songList){
        for (String data : songList){
            System.out.println(data);
        }
    }

    /*
    5. Call each of the methods above from the main method.
    The pseudocode for the main method is as given below.
    Make sure to catch any Exception that might be thrown.
    */

    public static final String SONGS_FILENAME = "song-names.txt";
    public static void main(String[] args) {

        //Problem 2
        try {
            String[] songs = getSongsArray(-2);
            writeSongs(songs, SONGS_FILENAME);
            ArrayList<String> songList = readSongs(SONGS_FILENAME);

            printSongs(songList);
        } catch (IllegalArgumentException e) {
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}