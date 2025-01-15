/**
 * @author Treasure Chandler
 */

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
}
