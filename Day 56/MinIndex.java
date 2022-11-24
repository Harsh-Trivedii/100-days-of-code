//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function template for JAVA

class Solution
{
    //Function to find the minimum indexed character.
    public static int minIndexChar(String str, String patt)
    {
        // Your code here
        HashMap<Character, Integer> hm = new HashMap<>();
         
        // to store the index of character having
        // minimum index
        int minIndex = Integer.MAX_VALUE;
      
        // lengths of the two strings
        int m = str.length();
        int n = patt.length();
      
        // store the first index of each character of 'str'
        for (int i = 0; i < m; i++)
            if(!hm.containsKey(str.charAt(i)))
                hm.put(str.charAt(i),i);
      
        // traverse the string 'patt'
        for (int i = 0; i < n; i++)
            // if patt[i] is found in 'um', check if
            // it has the minimum index or not accordingly
            // update 'minIndex'
            if (hm.containsKey(patt.charAt(i)) &&
                hm.get(patt.charAt(i)) < minIndex)
                minIndex = hm.get(patt.charAt(i));
      
        // print the minimum index character
        if (minIndex != Integer.MAX_VALUE)
            return minIndex;
      
        // if no character of 'patt' is present in 'str'
        else
            return -1;
    }
}

//{ Driver Code Starts.

class GFG {
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		    t--;
		    
		    String s1=sc.next();
		    String s2=sc.next();
		    
		    int res = new Solution().minIndexChar(s1, s2);
		    System.out.println(res);
		}
	}
}

// } Driver Code Ends
