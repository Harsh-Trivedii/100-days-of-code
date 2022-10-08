// matrix addition and multiplication
import java.util.*;
public class matrix
{
	int a[][]=new int[10][10];
	int b[][]=new int[10][10];	
	Scanner s=new Scanner(System.in);
	public static void main(String args[])
	{
		int row,column;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of rows and column:");
		row=s.nextInt();
		column=s.nextInt();
		matrix ob=new matrix();
		ob.getdata(row,column);
		ob.display(row,column);
		ob.add(row,column);
		ob.mul(row,column);
	}
	void getdata(int row,int column)
	{
		int i,j;
		System.out.println("Enter elements of matrix A:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("Enter elements of matrix B:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				b[i][j]=s.nextInt();
			}
		}

	}
	void display(int row,int column)
	{
		int i,j;
		System.out.println("Elements of matrix A:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				System.out.print(a[i][j]+" ");			
			}
			System.out.println();
		}
		System.out.println("Elements of matrix B:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				System.out.print(b[i][j]+" ");			
			}
			System.out.println();
		}
	}
	void add(int row,int column)
	{
		int i,j;
		int sum[][]=new int[row][column];
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Sum of matrix A and B:");		
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				System.out.print(sum[i][j]+" ");			
			}
			System.out.println();
		}
	}
	void mul(int row,int column)
	{
		int i,j;
		int m[][]=new int[row][column];
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				m[i][j]=0;
				for(int k=0;k<column;k++)
				{
					m[i][j]=m[i][j]+(a[i][k]*b[k][j]);
				}
			}
		}
		System.out.println("Product of matrix A and B:");		
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				System.out.print(m[i][j]+" ");			
			}
			System.out.println();
		}		
	}
}
