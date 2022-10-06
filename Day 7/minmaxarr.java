// Finding minimum and maximum element in a array
import java.util.Scanner;
public class minmaxarr
{
public static void main(String args[])
{
	int marks[]=new int[5];
	Scanner s=new Scanner(System.in);
	System.out.println("Enter elements:");
	for(int i=0;i<5;i++)
	{
		marks[i]=s.nextInt();
	}
	System.out.println("Array variables are:");
	for(int i=0;i<5;i++)
	{
		System.out.print(" "+marks[i]);
	}
	int min=marks[0];
	for(int i=1;i<5;i++)
	{
		if(min>marks[i])
		{
			min=marks[i];
		}
	}
	System.out.println("\nMininum element is:"+min);


	int max=marks[0];
	for(int i=1;i<5;i++)
	{
		if(max<marks[i])
		{
			max=marks[i];
		}
	}
	System.out.println("\nMaximum element is:"+max);

}
}
