// Matrix operations - sum of each element , sum of row, sum of column, finding max. sum of row and column
import java.util.Scanner;
public class matrixop
{
	int n[][]=new int[3][3];

public static void main(String args[])
{
	que1 t=new que1();
	t.input();	
 	t.display();
	t.sumrow();
	t.sumcol();
	t.sumall();
	t.max();


}
void input()
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter array elements:");
	for(int i=0;i<3;i++)
	{
	   for(int j=0;j<3;j++)
	   {
		n[i][j]=s.nextInt();
	   }
	}
}
void display()
{
	System.out.println("Entered array elements are:");
	for(int i=0;i<3;i++)
	{
	    for(int j=0;j<3;j++)
	    {
		System.out.print(n[i][j]+" ");
	    }
	    System.out.println();	
	}
}

void sumall()
{
	System.out.println("Sum of each element:");
	int sum=0;
	for(int i=0;i<3;i++)
	{
	    for(int j=0;j<3;j++)
	    {
		sum+=n[i][j];
	    }
	}
	System.out.print(sum);


}

void sumrow()
{
	System.out.println("\nSum of each row:");
	int sum=0;
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			sum+=n[i][j];
		}
		System.out.println(sum);
		sum=0;

	}
}

void sumcol()
{
	System.out.println("\nSum of each column:");
	int sum=0;
	for(int j=0;j<3;j++)
	{
		for(int i=0;i<3;i++)
		{
			sum+=n[i][j];
		}
		System.out.println(sum);
		sum=0;

	}
}


void max()
{
	int sum=0;
	int mx=0;
	System.out.println("\nMax sum of row:");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
			{
				sum+=n[i][j];	
			}	
		if(mx<sum)
		{
			mx=sum;
		}
		sum=0;		
	}
	System.out.println(mx);
	mx=0;
	sum=0;
	System.out.println("Max sum of column:");
	for(int j=0;j<3;j++)
	{
		for(int i=0;i<3;i++)
			{
				sum+=n[i][j];	
			}
		if(mx<sum)
		{
			mx=sum;
		}
		sum=0;		
	}
	System.out.println(mx);


}
}
