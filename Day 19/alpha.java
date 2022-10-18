// Entered name sorted in alphabetical order
import java.util.*;
public class alpha
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter how many names you want to enter:");
		int n=s.nextInt();
		String s1[]=new String[n];
		System.out.println("Enter your names:");
		for(int i=0;i<n;i++)
		{
			s1[i]=s.next();
		}
		String temp;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(s1[i].compareTo(s1[j]) >0)
				{
					temp=s1[i];
					s1[i]=s1[j];
					s1[j]=temp;
				}
			}
		}
		System.out.println("The names in alphabetical order are:");
		for(int i=0;i<n;i++)
		{
			System.out.println(s1[i]);
		}
	}
}
