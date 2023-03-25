import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix1 = {{5,3,7}, {6,8,9}, {2,1,2}};
        int[][] matrix2 = {{4,6,1}, {7,9,5}, {6,8,7}};

        int[][] resultMatrix = addMatrices(matrix1, matrix2);
        System.out.println("The sum of the two matrices is: ");
        for (int i = 0; i < resultMatrix.length; i++)
        {
            System.out.print(Arrays.toString(resultMatrix[i]));
        }
    }

    // method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }
}
