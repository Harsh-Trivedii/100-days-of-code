//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}
// } Driver Code Ends


class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        int n[]=new int[26];
        
        for(int x=0;x<26;x++)
            n[x]=0;
        
        for(int x=0;x<a.length();x++){
            int val=(int)a.charAt(x)-97;
            n[val]=n[val]+1;
        }
        
        for(int x=0;x<b.length();x++){
            int val=(int)b.charAt(x)-97;
            n[val]=n[val]-1;
        }
        
        for(int x=0;x<26;x++)
            if(n[x]!=0)
                return false;
        
        return true;

        
    }
}
