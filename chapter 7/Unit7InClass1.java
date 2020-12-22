import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Unit7InClass1 {

    public static ArrayList<String> readFile() {
        ArrayList<String> versesList = new ArrayList<>();

        String fileName = "alma-mater.txt";
        File fileToRead = new File(fileName);
        Scanner in = null;

        try {
            in = new Scanner(fileToRead);
            while (in.hasNextLine()){
                String line = in.nextLine();
                versesList.add(line);
            }
            versesList = completeAlmaMaterFirstVerse(versesList);
        } catch (FileNotFoundException e) {
            String errMsg = e.getMessage();
            System.out.println(errMsg);
        } finally {
            if (in != null){in.close();}
        }

        return versesList;

    }

    public static ArrayList<String> completeAlmaMaterFirstVerse(ArrayList<String> existingVerse){
        existingVerse.add("For the future that we wait,");
        existingVerse.add("Raise the song, raise the song.");

        return existingVerse;
    }

    public static void writeFile (ArrayList<String> dataToWrite, String fileName){
        PrintWriter out = null;
        try {
            out = new PrintWriter(fileName);
            for (String data : dataToWrite){
                out.println(data);
            }
        } catch (Exception e) {
            String errMsg = e.getMessage();
            System.out.println(errMsg);
        } finally {
            if (out != null){
                out.close();
            }
        }
    }
    
    public static void main(String[] args) {
        String fileName = "alma-mater.txt";

        System.out.println("Reading File...");
        ArrayList<String> verses = readFile();
        
        writeFile(verses, fileName);
        System.out.println("File written successfuly.");
    }
}
