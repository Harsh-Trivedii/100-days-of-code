//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class ExtractInt{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String s = read.readLine();
            Solution ob = new Solution();
            ArrayList<String> ans = ob.extractIntegerWords(s);
            if(ans.size()==0)
                System.out.println("No Integers");
            else{
                for(int i=0;i<ans.size();i++)
                    System.out.print(ans.get(i)+" ");
                System.out.println();
            }
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    ArrayList<String> extractIntegerWords(String s) 
    { 
        // code here
        ArrayList<String>al = new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
            {
                int j=i;
                while(j<s.length() && (s.charAt(j)>='0'&& s.charAt(j)<='9'))
                {
                    j++;
                }
                al.add(s.substring(i,j));
                i=j;
            }
        }
        return al;
    }
} 
