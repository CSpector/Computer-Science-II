/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokuplayer;

/**
 *
 * @author Colton Spector
 */
public class Sudoku {
    // Initalize a 9X9 Array of characters 
    char[][] sudoku = new char[9][9];
 
    public Sudoku(String starting_configuartion) {
        int xCoord = 0;
        int yCoord = 0;
        // < 90 because of the \n at the end of each statement
        for (int index = 0; index < 90; index++) {
            if( starting_configuartion.charAt(index) != '\n') {
                // Iterates through every sqaure and assigns the value
                sudoku[xCoord / 9][yCoord % 9] = starting_configuartion.charAt(index);
                xCoord++;
                yCoord++;
            }
        
        }
    }
    // Get sqaure method that return the row and column 
    public char getSquare(int row, int col) {
        return sudoku[row][col];
    }
    // Set sqaure method that assigns the value inputted to the sqaure
    public void setSquare(int row, int col, char value) {
        sudoku[row][col] = value;
    }
    // Method that sees that the row is valid
    public boolean isRowValid(int row)
    {
        int val = 0;
        for (int i = 0; i < 8; i++)
        {
            if(sudoku[row][i] != ' ')
            {
                val = sudoku[row][i];
            }
            for(int j = i+1; j < 9; j++)
            {
                if(val == sudoku[row][j])
                {
                    return false;
                }
            }
        }
        return true;
    }
    // Searches through each row to make sure that all rows are valid
    public boolean allRowsValid()
    {
        for(int i = 0; i < 9; i++)
        {
            if(!isRowValid(i))
            {
                return false;
            }
        }
        return true;
    }
    // Checks if an individual column is valid
    public boolean isColumnValid(int col)
    {
        int val = 0;
        for (int i = 0; i < 8; i++) 
        {
            if(sudoku[i][col] != ' ') 
            {
                val = sudoku[i][col];
            }
            for (int j = i + 1; j < 9; j++)
            {
                if (val == sudoku[j][col])
                {
                    return false;
                }
            }
        }
        return true;
    }
        
    // Seaches the boards columns to make sure that all inputs are valid
    public boolean allColValid() 
    {
        for(int i = 0; i < 9; i++)
        {
            if(!isColumnValid(i))
            {
                return false;
            }
        }
        return true;
    }
    // Checks to see if the whole board is valid
    public boolean isValid(){
        return allRowsValid() && allColValid();
    }
    // Unable to get this method to work correctly
 /*
    public boolean isBoxValid()
    {
        char val = 0;
        int j = 0;
        for (int i = 0; i < 9; i+=3 )
        {
            for(int k = 0; k < 3; k++)
            {
                if(sudoku[k][j] != ' ')
                {
                    val = sudoku[k][j];
                }

                if(i % 3 == 0 && j %3 == 0)
                {
                    j++;
                }
                if(sudoku[k][j] == val)
                {
                    return false;
                }
                j++;
                if(j > )

            }
        }
        return true;
    }
*/
    // Checks to see if the whole board has been solved
    public boolean isSolved() 
    {
        for(int i = 0; i < 9; i ++)
        {
            for (int j = 0; j < 9; j++)
            {
                if(sudoku[i][j] == ' ')
                {
                    return false;
                }
            }
        }
        return allRowsValid() && allColValid();
    }
}
