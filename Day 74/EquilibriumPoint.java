//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class EquilibriumPoint {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            
            //taking input n
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            Solution ob = new Solution();
            
            //calling equilibriumPoint() function
            System.out.println(ob.equilibriumPoint(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        long s1=0;
       if(n==1)
       return (int)1;
       for(int i=0;i<n;i++)
       {
           s1+=arr[i];
       }
       long s2=0;
       for(int j=0;j<n;j++)
       {
           s1-=arr[j];
           if(j!=0)
           {
           s2+=arr[j-1];
           }
           if(s1==s2)
           {
               return (int)(j+1);
           }
           
       }
       return -1;

    }
}
