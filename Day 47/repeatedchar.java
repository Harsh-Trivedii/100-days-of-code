//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class repeatedchar{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String s = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.firstRepChar(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String firstRepChar(String s) 
    { 
        // code here
        ArrayList<Character> list = new ArrayList<>(); 
  
         
        for (int i=0; i<=s.length()-1; i++) 
        { 
            char ch = s.charAt(i); 
  
             
            // Checks for repeated character 
            if (list.contains(ch)) 
                return ""+ch; 
            //Adds unique character to the list
            else 
                list.add(ch); 
        }
        return "-1";
    }
} 
