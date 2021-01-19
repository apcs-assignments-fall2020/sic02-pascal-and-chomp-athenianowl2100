public class MyMain {
    // Print out a 2D int array
    public static void print2DArray(int[][] mat) {
        for (int row = 0; row < mat.length; row++) 
        {
            for (int col = 0; col < mat[0].length; col++)
            {
                System.out.print(mat[row][col] + " ");
            }
            System.out.println();
        }
    }

    // Print out a 2D int array, but print it out as a "triangle"
    public static void printTriangle(int[][] triangle) {
        for (int row = 0; row < triangle.length; row++) 
        {
            for (int col = 0; col <= row; col++)
            {
                System.out.print(triangle[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Code to test Pascal's Triangle
        print2DArray(Pascal.pascalTriangle(3));
        printTriangle(Pascal.pascalTriangle(4));
        printTriangle(Pascal.pascalTriangle(5));

        // Code to play Chomp
        // Chomp.play();
    }
}
