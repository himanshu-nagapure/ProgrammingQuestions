import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Given an array and a key, the task is to remove all occurrences of the specified key from the array in Java.

Examples:
Input: array = { 3, 9, 2, 3, 1, 7, 2, 3, 5 }, key = 3
Output: [9, 2, 1, 7, 2, 5]
*/
public class Question3 {
    public static void main(String[] args) {
        int[] array = { 3, 9, 2, 3, 1, 7, 2, 3, 5 };
        int key = 3;

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if(array[i] != key)
                arr.add(array[i]);
        }
        System.out.println("Before : " +Arrays.toString(array));
        System.out.println("After :" +Arrays.toString(arr.toArray()));
    }
}
