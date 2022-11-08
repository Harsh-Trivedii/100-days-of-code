/*
Question link: https://practice.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/1?page=1&category[]=Arrays&curated[]=1&sortBy=submissions
Problem: Check if two arrays are equal or not

Question: Given two arrays A and B of equal size N, the task is to find if given arrays are equal or not. 
Two arrays are said to be equal if both of them contain same set of elements, arrangements (or permutation) of elements may be different though.

Example:
Input:
N = 5
A[] = {1,2,5,4,0}
B[] = {2,4,5,0,1}
Output: 1
Explanation: Both the array can be 
rearranged to {0,1,2,4,5}

Expected Time Complexity : O(N)
Expected Auxilliary Space : O(N)

Constraints:
1<=N<=107
1<=A[],B[]<=1018

Test cases: 10126 / 10126
*/
// main class is predefined in the question.

class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        int a=A.length;
        int b=B.length;
        if(a!=b)
            return false;
        else
        {
            Arrays.sort(A);
            Arrays.sort(B);
            for(int i = 0; i < N; i++)
            {
                if(A[i] != B[i])
                {
                    return false;
                }
            }
        }
        return true;
    }
}
