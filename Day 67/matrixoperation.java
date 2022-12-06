import java.util.Scanner;
public class matrixoperation
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int a[][]=new int[3][3];
		int srow,scol,selem=0;
		System.out.println("Enter your elements:");
		for(int i=0;i<3;i++)
		{
		for(int j=0;j<3;j++)
		{
			a[i][j]=s.nextInt();		
		}
		}
		for(int i=0;i<3;i++)
		{
		for(int j=0;j<3;j++)
		{
		System.out.print(" "+a[i][j]);
		}
		System.out.println();		
		}
		for(int i=0;i<3;i++)
		{
		srow=0;
		scol=0;
		for(int j=0;j<3;j++)
		{
			srow=srow+a[i][j];
			scol=scol+a[j][i];
			selem=selem+a[i][j];
		}
		System.out.println("Sum of "+(i+1)+"row="+srow);
		System.out.println("Sum of "+(i+1)+"column="+scol);
		}
		System.out.println("Sum of elements:"+selem);
	}
}
