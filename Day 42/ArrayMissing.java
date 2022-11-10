/*
Question Link:
https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&category[]=Arrays&curated[]=1&sortBy=submissions
Problem:Missing number in array
Question:Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.

Example:

Input:
N = 5
A[] = {1,2,3,5}
Output: 4

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ N ≤ 106
1 ≤ A[i] ≤ 106

Test Cases:307 / 307
*/

//{ Driver Code Starts
import java.io.*;
import java.util.*;

class ArrayMissing {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] array = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                array[i] = Integer.parseInt(str[i]);
            }
            Solution sln = new Solution();
            System.out.println(sln.MissingNumber(array, n));
        }
    }
}
// } Driver Code Ends

class Solution {
    int MissingNumber(int array[], int n) {
        // Your Code Here
        int sum = (n * (n + 1)) / 2;
        for (int i = 0; i < n-1; i++)
            sum -= array[i];
        return sum;
    }
}
