import java.util.ArrayList;
import java.util.Scanner;



public class Unit6InClass1 {
    
    public static void main(String[] args) {
        String title = getTitle();
        ArrayList<Integer> values = valuesList();
        graphOutput(title, values);

    }
    //A method that takes no parameters and returns a String.
    //Request a String from the user to be used for the title of the graph.

    public static String getTitle() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the title of the graph: ");
        String title = in.nextLine();
        return title;
    }

    //A method that takes no parameters and returns an ArrayList of Integers.
    //Ask the user to enter a list of integers. They can enter as many integers as they like.
    //The method returns these in the ArrayList.

    public static ArrayList<Integer> valuesList() {
        Scanner in2 = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.println("Enter your values, and press any non-numerical key to stop:");
        while (in2.hasNextInt()){
            numbers.add(in2.nextInt());
        }
        return numbers;
    }

    //A method that takes a String (the graph title) and an ArrayList of Integers as parameters.
    //This method prints the title and a graph to the command line using the ArrayList of Integers as data.
    //Each value in the ArrayList is the number of stars to print on that line.
    //Each element in the ArrayList is a separate line in the graph.

    public static void graphOutput(String graphTitle, ArrayList<Integer> values){
        System.out.println(graphTitle);

        for (int i = 0; i < values.size(); i++){
            for (int j = 0; j < values.get(i); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
