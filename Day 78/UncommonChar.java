//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class UncommonChar
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String A = sc.next();
                    String B = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.UncommonChars(A, B));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String UncommonChars(String A, String B)
    {
        // code here
         
       int hash_A[]=new int[26];

        int hash_B[]=new int[26];

        for(int i=0;i<A.length();i++){

            hash_A[A.charAt(i)-'a']=1;

        }

         for(int i=0;i<B.length();i++){

            hash_B[B.charAt(i)-'a']=1;

    }

    String res="";

    for(int i=0;i<26;i++){

        if((hash_A[i] ^ hash_B[i]) !=0)

          res+=(char)('a'+i);

    }

    return (res.length()==0) ? "-1" : res;



    }
}
