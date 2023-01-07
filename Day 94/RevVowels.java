//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class RevVowels
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
           
            Solution ob = new Solution();
            
            System.out.println(ob.modify(s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String modify (String s)
    {
        // your code here
        String partstring = "";
        String finalstring = "";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                partstring=s.charAt(i)+partstring;
            }
        }
        for(int i=0,j=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                finalstring +=partstring.charAt(j);
                j++;
            }
            else
            {
                finalstring +=s.charAt(i);
            }
        }
        return finalstring;

    }
}
