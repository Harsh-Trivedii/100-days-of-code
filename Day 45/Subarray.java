//{ Driver Code Starts

import java.util.*;
import java.lang.*;
import java.io.*;

class Subarray {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            long n = Long.parseLong(stt.nextToken());
            long m = Long.parseLong(stt.nextToken());
            long a1[] = new long[(int)(n)];
            long a2[] = new long[(int)(m)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a1[i] = Long.parseLong(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                a2[i] = Long.parseLong(inputLine1[i]);
            }
            
            
            Compute obj = new Compute();
            System.out.println(obj.isSubset( a1, a2, n, m));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
     int i = 0, j = 0;
 
        if (n < m)
            return "No";
 
        Arrays.sort(a1); // sorts arr1
        Arrays.sort(a2); // sorts arr2
 
        while (i < m && j < n) {
            if (a1[j] < a2[i])
                j++;
            else if (a1[j] == a2[i]) {
                j++;
                i++;
            }
            else if (a1[j] > a2[i])
                return "No";
        }
 
        if (i < m)
            return "No";
        else
            return "Yes";
    }
    
}
