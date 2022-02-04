/*
Given two sequences with non repeating characters, find the length of longest subsequence present in both of them.
 Both the strings are of uppercase.
 Input:
A = 6, B = 6
str1 = ABCDGH
str2 = AEDFHR
Output: 3
Explanation: LCS for input Sequences
“ABCDGH” and “AEDFHR” is “ADH” of
length 3.
*/
public class Question8 {
    public static void main(String[] args) {
       String str1 = "ABCDGH";
       String str2 = "AEDFHR";
       String lcs = "";
        int k=0;
       for (int i = 0; i < str1.length(); i++) {
           String ch = String.valueOf(str1.charAt(i));
           if(str2.contains(ch)){
                if(str2.indexOf(ch) >= k){
                    lcs+=ch;
                    k=str2.indexOf(ch);
                }
           }
       }
       System.out.println(lcs);
    }
}
