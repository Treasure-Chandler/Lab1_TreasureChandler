/**
 * @author Treasure Chandler
 */

import java.io.*;       // Mainly used for the PrintWriter class
import java.util.*;     // Mainly used for the Scanner class

public class Student {
    // Variables declaration
    private String name; // Student's name
    private char grade; // Student's grade
    private double average; // Average score
    private int[] scores = new int[5]; // Array of student's scores

    // Initializes variables to their default values
    public Student() {
        name = "";
        grade = ' ';
        average = 0.0;
    } // End of Student constructor

    // Values input will be the parameters for this constructor
    public Student(String n, char g, double a, int[] s) {
        this.name = n;
        this.grade = g;
        this.average = a;
        this.scores = s;
    } // End of Student constructor

    /**
     * Get the student's name
     * @return      Student's name
     */
    public String getName() {
        return this.name;
    } // End of getName()

    /**
     * Get the student's grade
     * @return      Student's grade
     */
    public char getGrade() {
        return this.grade;
    } // End of getGrade()

    /**
     * Get the average scores
     * @return      Average scores
     */
    public double getAverage() {
        return this.average;
    } // End of getAverage()

    /**
     * Get the array of scores
     * @return      Array of scores
     */
    public int[] getScores() {
        return this.scores;
    } // End of getScores()

    /**
     * Set the student's name
     * @param n     Student's name param
     */
    public void setName(String n) {
        this.name = n;
    } // End of setName()

    /**
     * Set the student's grade
     * @param g     Student's grade param
     */
    public void setGrade(char g) {
        this.grade = g;
    } // End of setGrade()

    /**
     * Set the average scores
     * @param a     Average scores param
     */
    public void setAverage(double a) {
        this.average = a;
    } // End of setAverage()

    /**
     * Set the array of scores
     * @param s     Array of scores param
     */
    public void setScores(int[] s) {
        this.scores = s;
    } // End of setScores()

    /**
     * Determine the average of 5 test scores for each student
     */
    public void calculateAverage() {
        // Avoid division by 0
        if (scores.length == 0) {
            return;
        }

        int sum = 0;
        for (int num : scores) {
            sum += num;
        }

        // Actual average calculation
        double average = (double) sum / scores.length;
    } // End of calculateAverage()

    /**
     * Determine each student's letter grade based on the scores
     */
    public void calculateGrade() {
        if (average >= 90 && average <= 100) {
            grade = 'A';
        } else if (average >= 80 && average <= 89) {
            grade = 'B';
        } else if (average >= 70 && average <= 79) {
            grade = 'C';
        } else if (average >= 60 && average <= 69) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    } // End of calculateGrade()

    public void generateOutput(PrintWriter outFile) {
        try {
            Scanner sc = new Scanner(new File("students.in"));
            outFile = new PrintWriter(new File("students.out"));

            // Output file header
            outFile.printf("\"%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s%n\",\n" +
                            "Student", "Test 1", "Test 2", "Test 3", "Test 4", "Test 5", "Ave", "Grade");

            // Process each line in students.in
            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim();

                
            }
        } catch (IOException e) {
            System.err.println("An error occured: " + e.getMessage());
        }

        outFile.close();
    } // End of generateOutput()
} // End of Student