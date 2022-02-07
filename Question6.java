/*
A frog jumps either 1, 2, or 3 steps to go to the top. 
In how many ways can it reach the top?
*/
import java.util.Scanner;

public class Question6 {
    static int countWays(int steps){
        if(steps<=2){
            return steps;
        }
        int arr[] = new int[steps+1];
        arr[0]=1;
        arr[1]=1;
        arr[2]=2;
        for(int i=3;i<steps+1;i++){
          arr[i] = (arr[i-1]+arr[i-2]+arr[i-3]);
        }
        return arr[arr.length - 1];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = scanner.nextInt();
        scanner.close();
        System.out.println("Total ways in which the frog can reach the top is "+countWays(steps));
    }
}
