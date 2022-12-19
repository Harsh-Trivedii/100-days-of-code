//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class Rotatebits
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int d = sc.nextInt();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.rotate (n, d);
            System.out.println(res.get(0));
            System.out.println(res.get(1));
            
           
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
       // your code here
         ArrayList<Integer> rotate(int N, int D)
    {
        // your code here
        D = D%16;
        ArrayList<Integer> arr = new ArrayList<>();
        int a =((N<<D)|(N>>(16-D)))&0xFFFF;
        int b = ((N>>D)|(N<<(16-D)))&0xFFFF;
        
        arr.add(Integer.valueOf(a));
        arr.add(Integer.valueOf(b));
        return arr;
        
      
    }
}
