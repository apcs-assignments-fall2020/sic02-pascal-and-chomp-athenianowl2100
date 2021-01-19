import java.util.Scanner;
/**
 * Write a description of class Chomp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Chomp
{
    // Eat all '*' to the right and bottom of (row, col)
    // (eating means replacing the relevant '*' with a space ' ')
    // Returns true if some food was eaten
    // Returns false if it was an invalid move (either out of bounds
    // or given food was already eaten)
    public static boolean eat(char[][] board, int row, int col)
    {        
        // Return false if they tried to eat a block that is out of bounds
        if (row >= board.length || col >= board[0].length) {
            System.out.println("Try again! Out of bounds!");
            return false;
        }

        // Return false if they tried to eat a block that was already eaten
        if (board[row][col] != '*') {
            System.out.println("Try again! That was already eaten!");
            return false;
        }
        
        // Eat everything
        for (int i = row; i < board.length; i++)
        {
            for (int j = col; j < board[0].length; j++)
            {
                board[i][j] = ' ';
            }
        }
        return true;
    }
    
    public static void printBoard(char[][] board)
    {
        for (char[] row: board) 
        {
            for (char val: row)
            {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    
    public static void play()
    {
        char[][] board = new char[4][7];
        for (int row = 0; row < board.length; row++)
        {
            for (int col = 0; col < board[0].length; col++)
            {
                board[row][col] = '*';
            }
        }
        
        Scanner scan = new Scanner(System.in);
        
        int playerNum = 1;
        
        while (board[0][0] == '*')
        {
            printBoard(board);
            System.out.print("Player " + playerNum + ", enter a row: ");
            int row = scan.nextInt();
            System.out.print("Player " + playerNum + ", enter a column: ");
            int col = scan.nextInt();
            if (eat(board, row, col))
            {
                playerNum = (playerNum % 2) + 1;
            }
        }

        System.out.println("You lose, Player " + playerNum + "!");

        scan.close();
    }
}
