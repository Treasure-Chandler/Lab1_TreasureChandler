/**
 * @author Treasure Chandler
 */

import java.io.*;       // Mainly used for file reading stuff
import java.util.*;     // Used for the Scanner, ArrayList, and List classes

public class Lab1ADriver {
    /**
     * Method that helps this class and the Rectangle class run
     * @param args      Entered values
     */
    public static void main(String[] args) {
        // Variables declaration
        Rectangle[] rectangles = null;
        String rectangleFile = "rectangles.txt";

        // Retrieve the "rectangles.txt" file
        try (Scanner rectangleScan = new Scanner(new File(rectangleFile))) {
            // Read the total number of lines in the file
            int rectangleAmount = rectangleScan.nextInt();
            rectangleScan.nextLine();

            // Initialize the object array with the given size
            rectangles = new Rectangle[rectangleAmount];

            // Parse the rectangle data and store it in the array
            for (int i = 0; i < rectangleAmount; i++) {
                if (rectangleScan.hasNextLine()) {
                    // Read the lines
                    String line = rectangleScan.nextLine();
                    String[] bits = line.split("\\s+");

                    // Read the status of the rows, columns, and filled/unfilled
                    int numRows = Integer.parseInt(bits[0]);
                    int numCols = Integer.parseInt(bits[1]);
                    boolean filled = bits[2].equalsIgnoreCase("filled");

                    // Instantiate a new rectangle object to store in the array
                    rectangles[i] = new Rectangle(numRows, numCols, filled);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File \"rectangles.txt\" not found: " + e.getMessage());
        } // End of try-catch

        // Print the rectangles
        if (rectangles != null) {
            for (Rectangle rectangle : rectangles) {
                System.out.println(rectangle);
            }
        }
    } // End of main()
} // End of Lab1ADriver