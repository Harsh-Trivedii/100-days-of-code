//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class Longpalind
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static String longestPalin(String S){
        // code here
        
   if(S.length()==1)
            return S;
            int maxlen = 1;
            int n = S.length();
            int st =0,end=0;
            for(int i=0;i<n-1;i++)
            {
                int l =i;
                int r = i;
                while(l>=0 && r<n)
                {
                    if(S.charAt(l)==S.charAt(r))
                    {
                        l--;
                        r++;
                        
                        
                    }
                    else
                    {
                        break;
                    }
                }
                int len = r-l-1;
                if(len >maxlen)
                {
                    maxlen = len;
                    st = l+1;
                    end =r-1;
                    
                }
            }
            for(int i=0;i<n-1;i++)
            {
                int l =i;
                int r = i+1;
                while(l>=0 && r<n)
                {
                    if(S.charAt(l)==S.charAt(r))
                    {
                        l--;
                        r++;
                        
                        
                    }
                    else
                    {
                        break;
                    }
                }
                int len = r-l-1;
                if(len >maxlen)
                {
                    maxlen = len;
                    st = l+1;
                    end =r-1;
                    
                }
            }
        
        return S.substring(st,end+1);
        
    }
}
