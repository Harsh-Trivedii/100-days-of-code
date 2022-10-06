// searching a element in a array
import java.util.Scanner;
public class search
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int n[]=new int[5];
	int flag=0;
	System.out.println("Enter 5 numbers:");
	for(int i=0;i<5;i++)
	{
		n[i]=s.nextInt();
	}
	System.out.println("Array elements are:");
	for(int i=0;i<5;i++)
	{
		System.out.print(" "+n[i]);
	}
	System.out.println("\nEnter element you want to search:");
	int key=s.nextInt();
	for(int i=0;i<5;i++)
	{
		if(key==n[i])
		{
			System.out.println("Element found at position:"+(i+1));
			flag=1;
			break;
		}
	}
	if(flag==0)
	{
		System.out.println("Element not found");
	}
}
}
