// sorting an array in ascending order
import java.util.*;
public class sortarray
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("How many elements you want to enter:");
		int n=s.nextInt();
		int a[]=new int[n];
		int temp=0;
		System.out.print("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Array elements after sorting in ascending order:");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
