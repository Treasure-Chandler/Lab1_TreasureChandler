/**
 * @author Treasure Chandler
 */

import java.io.*;               // Needed for the PrintWriter classes
import java.util.Scanner;       // Needed for the Scanner class

public class Lab1BDriver {
    /**
     * Method that helps this class and the Student class run
     * @param args      Entered values
     */
    public static void main(String[] args) {
        // Student object array that can hold up to 30 students
        Student[] students = new Student[30];

        /*
         * Reads students.in that includes the students' data for
         * constructing Student objects
         */
        try (
            Scanner inFile = new Scanner(new File("students.in"));
            PrintWriter outFile = new PrintWriter(new File("students.out"));
        ) {
            // Variables to calculate the class average
            double totalAverage = 0.0;
            int studentCount = 0;

            /*
             * Construct a dummy Student object, and only write the header in the
             * students.out file
             */
            Student dummyStudent = new Student();
            dummyStudent.generateOutput(outFile, true);

            // Process each line in students.in
            while (inFile.hasNextLine()) {
                String line = inFile.nextLine().trim();
                String[] bits = line.split("\\s+");
                
                // Construct the actual Student object
                Student stuObject = new Student();

                // Extract name with its respective scores
                stuObject.setName(bits[0]);

                // Extract and set scores
                int[] scores = new int[5];
                for (int i = 0; i < 5; i++) {
                    scores[i] = Integer.parseInt(bits[i + 1]);
                }
                stuObject.setScores(scores);
                
                // Calculate average and determine the grade
                stuObject.calculateAverage();
                stuObject.calculateGrade();

                // Store that student in the array
                students[studentCount] = stuObject;

                // Accumulate the average and get the student count
                totalAverage += stuObject.getAverage();
                studentCount++;

                // Then, write the details to student.out
                outFile.printf("%-10s %-10d %-10d %-10d %-10d %-10d %-10.1f %-10c%n", 
                                stuObject.getName(), stuObject.getScores()[0], stuObject.getScores()[1],
                                stuObject.getScores()[2], stuObject.getScores()[3], stuObject.getScores()[4],
                                stuObject.getAverage(), stuObject.getGrade());
            }

            // Calculate the class average
            double classAverage = totalAverage / studentCount;
                
            // Then, write those details to student.out
            outFile.println();
            outFile.printf("Class average = %.2f", classAverage);
        } catch (IOException e) {
            System.err.println("An error occured: " + e.getMessage());
        }
    } // End of main()
} // End of Lab1BDriver
