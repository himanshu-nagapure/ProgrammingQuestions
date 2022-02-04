import java.util.ArrayList;
import java.util.List;

/**
 * Given an m x n matrix, return all elements of the matrix in spiral order
 */
public class Question10 {
   public static void main(String[] args) {
    int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
    /*
    3*3 : 00 01 02 ,12 22, 21 20, 10 11
    3*4 : 00 01 02 03, 13 23, 22 21 20, 10 11 12
    rc ci , ri cc , rc cd , rc ci
    */
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> spiral = new ArrayList<>();
        /**
         * 0 - right
         * 1 - down
         * 2 - left
         * 3 - up
         */
        int state = 0;
        int minRows = 0;
        int maxRows = m - 1;
        int minColmns = 0;
        int maxColmns = n - 1;
        while (spiral.size() < m * n) {
            if (state == 0) {
                for (int j = minColmns; j <= maxColmns; j++) {
                    spiral.add(matrix[minRows][j]);
                }
                minRows++;
            } else if (state == 1) {
                for (int i = minRows; i <= maxRows; i++) {
                    spiral.add(matrix[i][maxColmns]);
                }
                maxColmns--;
            } else if (state == 2) {
                for (int j = maxColmns; j >= minColmns; j--) {
                    spiral.add(matrix[maxRows][j]);
                }
                maxRows--;
            } else if (state == 3) {
                for (int i = maxRows; i >= minRows; i--) {
                    spiral.add(matrix[i][minColmns]);
                }
                minColmns++;
            }
            state = (state + 1) % 4;
        }

        System.out.println(spiral.toString());
   } 
}
