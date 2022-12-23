//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.math.*;

class dict {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = Integer.parseInt(sc.next());
		while(t-- > 0)
		{
		    int n = Integer.parseInt(sc.next());
		    int k = Integer.parseInt(sc.next());
		    
		    String[] words = new String[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        words[i] = sc.next();
		    }
		    
		    Solution ob = new Solution();
		  //  System.out.println(T.findOrder(words,k));
		    String order = ob.findOrder(words,n,k);
		    if(order.length() == 0){
		        System.out.println(0);
		        continue;
		    }
		    String temp[] = new String[n];
		    for(int i=0;i<n;i++)
		        temp[i] = words[i];
		    
		    Arrays.sort(temp, new Comparator<String>(){
		    
		      @Override
                public int compare(String a, String b) {
                    int index1 = 0;
                    int index2 = 0;
                    for(int i = 0; i < Math.min(a.length(), b.length()) 
                                        && index1 == index2; i++) {
                        index1 = order.indexOf(a.charAt(i));
                        index2 = order.indexOf(b.charAt(i));
                    }
                
                    if(index1 == index2 && a.length() != b.length()) 
                    {
                        if(a.length() < b.length())
                            return -1;
                        else
                            return 1;
                    }
                
                    if(index1 < index2)
                        return -1;
                    else
                        return 1;
                        
                }
		    });
		    
		    int flag = 1;
		    for(int i=0;i<n;i++)
		    {
		        if(!words[i].equals(temp[i]))
	            {
	                flag = 0;
	                break;
	            }
		    }
		    
		    System.out.println(flag);
		}
	}
	
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String findOrder(String [] dict, int N, int K)
    {
        // Write your code here
         ArrayList<ArrayList<Integer>> adjLst=new ArrayList<>();
        int visited[]=new int[K];
        
        for(int i=0;i<K;i++)
        {
            adjLst.add(new ArrayList<>());
            visited[i]=0;
        }
        
        for(int i=0;i<dict.length-1;i++)
        {
            String s1=dict[i];
            String s2=dict[i+1];
            int len = Math.min(s1.length(),s2.length());
            for(int ptr=0;ptr<len;ptr++)
            {
               if(s1.charAt(ptr)!=s2.charAt(ptr))
               {
                   adjLst.get(s1.charAt(ptr)-'a').add(s2.charAt(ptr)-'a');
                   break;
               }
            }
        }
        //System.out.println(adjLst);
        
        Stack<Character> st =new Stack<>();
        for(int i=0;i<K;i++)
        {
            if(visited[i]==0)
            {
                DFS(i,adjLst,visited,st);
            }
        }
        
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty())
        {
            sb.append(st.pop());
        }
       // System.out.println(sb.toString());
        return sb.toString();
    }
    
    public void DFS(int node, ArrayList<ArrayList<Integer>> adjLst,int visited[], Stack<Character> st )
    {
        
        visited[node]=1;
        ArrayList<Integer> list=adjLst.get(node);
        for(int i=0;i<list.size();i++)
        {
            if(visited[list.get(i)]==0)
            {
                DFS(list.get(i),adjLst,visited,st);
            }
        }
        char ch = (char)(node+(int)('a'));
        st.push(ch);
    }

        
    
}
