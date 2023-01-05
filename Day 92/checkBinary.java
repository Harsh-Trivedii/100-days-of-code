//{ Driver Code Starts
import java.util.*;


class checkBinary
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T>0)
		{
			String str = sc.nextLine();
			GfG g = new GfG();
			boolean b = g.isBinary(str);
			if(b== true)
				System.out.println(1);
			else
			    System.out.println(0);
		T--;
		}
	}
}


// } Driver Code Ends


class GfG
{
	boolean isBinary(String str)
	{
	  //Your code here
	   boolean flag=true;
	  int n=str.length();
	  char ch;
	  for (int i=0;i<n;i++){
	      ch = str.charAt(i);
	      if (ch=='1'||ch=='0'){
	          flag=true;
	      }
	      else{
	          flag=false;
	          break;
	      }
	  }
	  return flag;
	}
}
