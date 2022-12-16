//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class LongestPrefix
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
        int len = arr[0].length();
        int ans = len;
        for(String item: arr){
            int j = 0;
            
            while(j < item.length() && j < len && item.charAt(j) == arr[0].charAt(j)){
                j++;
            }
            
            ans = Math.min(ans, j);
        }
        
        if(ans == 0) return "-1";
        
        return arr[0].substring(0, ans);

    }
}
