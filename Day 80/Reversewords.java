//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
      String rev(String a)
    {
        String s="";
        for(int i=a.length()-1;i>=0;i--)
        {
            s+=a.charAt(i);
        }
        return s;
    }
    String reverseWords(String S)
    {
       String b="";
       String res="";
       for(int i=S.length()-1;i>=0;i--)
       {
           char x=S.charAt(i);
           if(x!='.'){
               b+=x;
           }
           else
           {
               b=rev(b);
               res+=b;
               res+='.';
               b="";
           }
          
       }
       b=rev(b);
      
       res+=b;
        return res;
    }
       // code here 
    }
