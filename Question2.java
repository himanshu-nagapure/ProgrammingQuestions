// Program to Find Transpose of a Matrix
public class Question2 {
    public static void main(String[] args) {
        int row = 2, column = 3;
        int[][] matrix = { {1, 2, 4}, {3, 5, 9} };

        //Before changes
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("..............");
        //After changes
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
}
