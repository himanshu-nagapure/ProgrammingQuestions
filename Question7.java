import java.util.Scanner;

/*
Given two strings str1 and str2. The task is to remove or insert the minimum number of characters 
from/in str1 so as to transform it into str2. It could be possible that the same character needs 
to be removed/deleted from one point of str1 and inserted to some another point.

Input: str1 = "heap", str2 = "pea"
Output: 3
Explanation: 2 deletions and 1 insertion
p and h deleted from heap. Then, p is 
inserted at the beginning One thing to 
note, though p was required yet it was 
removed/deleted first from its position 
and then it is inserted to some other 
position. Thus, p contributes one to the 
deletion_count and one to the 
insertion_count.
*/
public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        scanner.close();

        int answer = 0;
        String substr = "";

        outerloop:
        for (int i = 0; i < str2.length() ; i++) {
            for (int j = 0; j <= i; j++) {
                substr = str2.substring(j, str2.length() - i + j);         
                if(str1.contains(substr)){
                    answer = str1.length() - substr.length() + i;
                    break outerloop;
                }
            }
            
        }
        System.out.println("Final answer : "+answer);
        
    }
}
