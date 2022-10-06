// Reversing a array
import java.util.*;
public class revarr
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter how many array elements you want to enter:");
	int n=s.nextInt();
	int a[]=new int[5];
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	int b[]=new int[n];
	int j=n;
	for(int i=0;i<n;i++)
	{
		b[j-1]=a[i];
		j=j-1;
	}
	System.out.println("After array reverse:");
	for(int i=0;i<n;i++)
	{
		System.out.print(b[i]+" ");
	}
}
}
