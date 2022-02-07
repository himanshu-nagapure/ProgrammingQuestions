import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Given an m x n matrix, return all elements of the matrix in spiral order
 */
public class Question10 {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();
    scanner.close();
    int[][] matrix = new int[input][input];
    /*
    3*3 : 00 01 02 ,12 22, 21 20, 10 11
    3*4 : 00 01 02 03, 13 23, 22 21 20, 10 11 12
    rc ci , ri cc , rc cd , rc ci
    */
    int currentNumber = 1;
    int minRows = 0;
    int maxRows = input - 1;
    int minColumns = 0;
    int maxColumns = input - 1;
    while (currentNumber <= input * input) {
        for (int i = minColumns; i <= maxColumns; i++) {
            matrix[minRows][i] = currentNumber;
            currentNumber++;
        }
        minRows++;

        for (int i = minRows; i <= maxRows; i++) {

            matrix[i][maxColumns] = currentNumber;
            currentNumber++;
        }
        maxColumns--;

        for (int i = maxColumns; i >= minColumns; i--) {

            matrix[maxRows][i] = currentNumber;
            currentNumber++;
        }
        maxRows--;

        for (int i = maxRows; i >= minRows; i--) {

            matrix[i][minColumns] = currentNumber;
            currentNumber++;
        }
        minColumns++;

    }

    System.out.println("Spiral matrix");
    for (int i = 0; i < input; i++) {
        for (int j = 0; j < input; j++) {
            System.out.print(matrix[i][j] + "\t");
        }
        System.out.println();
    }
   } 
}
