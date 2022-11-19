//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class Toys{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String st[] = in.readLine().trim().split("\\s+");
            int N = Integer.parseInt(st[0]);
            int K = Integer.parseInt(st[1]);
            String st1[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(st1[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.toyCount(N, K, arr));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int toyCount(int N, int K, int arr[])
    {
        // code here
         int count = 0, sum = 0;
 
    // sort the cost array
    Arrays.sort(arr);
    for (int i = 0; i < N; i++)
    {
 
        // Check if we can buy ith toy or not
        if (sum +arr[i] <= K)
        {
            sum = sum + arr[i];
            // Increment count
            count++;
        }
    }
    return count;
    }
}
