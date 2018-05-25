package lightsoutgame;
/**
 * Controls the exceptions and the pression on the game board
 * @author Colton Spector
 * @author Cameron Hardesty
*/
class LightsOut {
    /**
        Is used in the LightsOut method to set the size of the board
    */
    private int size;
    /**
        Is used in the LightsOut method to set the size of the boolean array
    */
    private boolean[][] grid;
    /**
        Initializes the size of the board and the size of the grid
        @param gSize How big the grid is going to be 
    */
    public LightsOut(int gSize) {
        if (gSize == 0)
                {
                    
                }
        size = gSize;
        grid = new boolean[gSize][gSize];

    }
    /**
        @return the size 
    */
    public int getSize() {
        return size;
    }
    /**
     * Records the press of a square 
     * @param row The row of the pressed square
     * @param col The column of the pressed square 
    */
    public void press(int row, int col) {
        grid[row][col] = !grid[row][col];
        toggle(row,col);
    }
    /**
     * Checks to see if a square is already lit
     * @param row Row of the square
     * @param col Column of the square
     * @return Boolean returns true if lit, False if not lit
     */
    public boolean isLit(int row, int col) {
        if (grid[row][col] == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    /**
     * Forces a square to become lit when pressed
     * @param row Row of the square that needs to be lit
     * @param col Column of the square that needs to be lit
     * @param value True or False
     */
    public void forceLit(int row, int col, boolean value) {
        grid[row][col] = value;
        grid[row][col] = !grid[row][col];
    }
    /**
     * Asks for forgiveness when a square is pressed 
     * @param row Row of the square toggled
     * @param col Column of the square toggled
     */
    private void toggle(int row, int col) {
        try {
            grid[row + 1][col] = !grid[row+1][col];
        }
        catch(ArrayIndexOutOfBoundsException ex) {
        }
        try {
            grid[row-1][col] = !grid[row-1][col];
        }
        catch(ArrayIndexOutOfBoundsException ex) {
        }
        try {
            grid[row][col+1] = !grid[row][col+1];
        }
        catch(ArrayIndexOutOfBoundsException ex) {
        }
        try {
            grid[row][col-1] = !grid[row][col-1];
        }
        catch(ArrayIndexOutOfBoundsException ex) {
        }
    }

}