//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;

  public class zigzag {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().zigZag(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    void zigZag(int arr[], int n) {
        // code here
        
  int flag = 1;
        
        for(int i = 0; i < arr.length - 1; i++) {
            if(flag == 1 && arr[i] > arr[i + 1]) {
                int t = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = t;
            } else if(flag == 0 && arr[i] < arr[i + 1]) {
               int t = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = t;
                
            }
            
            flag = flag == 0 ? 1 : 0;
}
    }
}
