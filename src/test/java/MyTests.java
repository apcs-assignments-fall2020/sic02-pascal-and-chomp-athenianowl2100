import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

public class MyTests {

    @Test
    public void testPascal() {
        String answer = "[[1, 0, 0, 0, 0], [1, 1, 0, 0, 0], [1, 2, 1, 0, 0], [1, 3, 3, 1, 0], [1, 4, 6, 4, 1]]";

        assertEquals(answer, Arrays.deepToString(Pascal.pascalTriangle(5)), "The expected output for a Pascal Triangle of height 5 should be: " + answer);
    }

    @Test
    public void testChomp() {
        char[][] board = new char[4][7];
        for (int row = 0; row < board.length; row++)
        {
            for (int col = 0; col < board[0].length; col++)
            {
                board[row][col] = '*';
            }
        }

        assertEquals(false, Chomp.eat(board, 5, 5), "Trying to eat (5, 5) should return false due to it being out of bounds");
        assertEquals(true, Chomp.eat(board, 3, 0), "Eating (3, 0) should return true because it is a valid move");
        assertEquals(false, Chomp.eat(board, 3, 0), "Eating (3, 0) should return false if (3, 0) has already been eaten");
    }
}
