/*
Problem: Subarray with given sum
Question:Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.
In case of multiple subarrays, return the subarray which comes first on moving from left to right.
Example:
Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements 
from 2nd position to 4th position 
is 12.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 <= N <= 105
1 <= Ai <= 109

Test Cases: 164 / 164
*/

//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class SubarraySum{
	static BufferedReader br;
    static PrintWriter ot;
    public static void main(String[] args) throws IOException{
        
        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            
            String s[] = br.readLine().trim().split(" ");
            
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int a[] = new int[n];
            s = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                a[i] = Integer.parseInt(s[i]);
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(a, n, k);
            for(int ii = 0;ii<res.size();ii++)
                ot.print(res.get(ii) + " ");
            ot.println();
        }
        ot.close();
    }

}
// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        
        int currentSum = arr[0], start = 0, i;
        for (i = 1; i <= n; i++) {
            while (currentSum > s && start < i - 1) {
                currentSum = currentSum - arr[start];
                start++;
            }
            if (currentSum == s) {
                int p = i - 1;
                ArrayList<Integer> arrli1= new ArrayList<Integer>(1);
                arrli1.add(start+1);
                arrli1.add(p+1);
                return arrli1;
            }
            if (i < n)
                currentSum = currentSum + arr[i];
        }
         ArrayList<Integer> arrli
            = new ArrayList<Integer>(0);
        arrli.add(-1);
        return arrli;
    }
}
