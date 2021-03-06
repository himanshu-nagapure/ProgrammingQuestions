import java.util.Scanner;

/**
 * You are given an array A of size N. The array contains integers and is of even length. 
 * The elements of the array represent N coin of values V1, V2, ....Vn. You play against an opponent in an alternating way.
In each turn, a player selects either the first or last coin from the row, removes it from the row permanently, 
and receives the value of the coin.
You need to determine the maximum possible amount of money you can win if you go first.
Note: Both the players are playing optimally.

Example 1:

Input:
N = 4
A[] = {5,3,7,10}
Output: 15
Explanation: The user collects maximum
value as 15(10 + 5)
Example 2:

Input:
N = 4
A[] = {8,15,3,7}
Output: 22
Explanation: The user collects maximum
value as 22(7 + 15)
 */
public class Question9 {
    public static void countMaximum(int arr[])
    {
        long[][] dp=new long[arr.length][arr.length];
	  	long sum=0;
	  	for(int i=0;i<arr.length;i++)
	  	{
	  	    sum+=arr[i];
	  	    for(int j=i-1;j>=0;j--)
	  	    {
	  	        if(j==i-1)
	  	        {
	  	            dp[i][j]=Math.abs(arr[i]-arr[j]);
	  	        }
	  	        else 
	  	        {
	  	            if(arr[i]-dp[i-1][j]>arr[j]-dp[i][j+1])
	  	            {
	  	                dp[i][j]=arr[i]-dp[i-1][j];
	  	            }
	  	            else 
	  	            {
	  	                dp[i][j]=arr[j]-dp[i][j+1];
	  	            }
	  	            
	  	        }
	  	    }
	  	}
	  	// return (sum+dp[dp.length-1][0])/2;
	  	System.out.println("The user can collect maximum value as : "+(sum+dp[dp.length-1][0])/2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int arr[] = new int[sizeOfArray];

        for(int i = 0; i < sizeOfArray; i++)
            arr[i] = sc.nextInt();
                
        countMaximum(arr); 
    }
}
