/*
Question link:https://practice.geeksforgeeks.org/problems/minimum-characters-to-be-added-at-front-to-make-string-palindrome/1
Question-Given string str of length N. The task is to find the minimum characters to be added at the front to make string palindrome.

Example-
Input:
S = "abc"
Output: 2
Explanation: 
Add 'b' and 'c' at front of above string to make it
palindrome : "cbabc"

Constraints:
1 <= S.length <= 106

Test cases: 576/576.
*/

class Solution {
    public static int minChar(String str) {
       //Write your code here
         int count=0;
         int i=0;
         int n=str.length()-1;
         int j=n;
            while(j>i)
            {
                if(str.charAt(i)!=str.charAt(j))
                {
                    count++;
                    j=--n;
                    i=0;
                }
                else
                {
                    i++;
                    j--;
                }
            }
        return count;
    }
}
