/**
 * @author Treasure Chandler
 */

public class Rectangle {
    // Variables declaration
    private int numRows; // Store the number of rows
    private int numCols; // Store the number of columns
    private boolean filled; // Defines either a filled or unfilled rectangle

    // Initializes variables to their default values
    public Rectangle() {
        numRows = 1;
        numCols = 1;
        filled = false;
    } // End of Rectangle constructor

    // Values input will be the parameters for this constructor
    public Rectangle(int recRow, int recCol, boolean fill) {
        this.numRows = recRow;
        this.numCols = recCol;
        this.filled = fill;
    } // End of Rectangle constructor

    /**
     * Get the number of rectangle rows
     * @return      Number of rows
     */
    public int getRows() {
        return this.numRows;
    } // End of getRows()

    /**
     * Get the number of rectangle columns
     * @return      Number of columns
     */
    public int getColumns() {
        return this.numCols;
    } // End of getColumns()

    /**
     * Set the number of rectangle rows
     * @param rowNum        Number of rows
     */
    public void setRows(int rowNum) {
        this.numRows = rowNum;
    } // End of setRows()

    /**
     * Set the number of rectangle columns
     * @param colNum        Number of columns
     */
    public void setColumns(int colNum) {
        this.numCols = colNum;
    } // End of setColumns

    /**
     * Create and return a string for console output
     * @return      The formatted string
     */
    @Override
    public String toString() {
        // Variables declaration
        String rectangleChar = "";

        /* 
         * Configures the rows and columns into "coordinates" using nested
         * for loops
         */
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                    // Filled logic
                    if (filled || i == 0 || i == numRows - 1 || j == 0 || j == numCols - 1) {
                        rectangleChar += "#";
                    } else {
                        rectangleChar += " ";
                    }
            }
            rectangleChar += "\n";
        }

        return rectangleChar;
    } // End of toString()
} // End of Rectangle