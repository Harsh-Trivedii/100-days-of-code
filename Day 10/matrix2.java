//Matrix transpose and determinent
public class matrix2
{
	static int n=3;
	public static void main(String args[])
	{
		int a[][]={{1,2,5},{4,5,6},{1,2,3}};
		int b[][]=new int[3][3];
		System.out.println("Given matrix:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		transpose(a,b);
		System.out.println("Transpose Matrix:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}	
		determinent(a);
	}
	static void transpose(int a[][],int b[][])
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				b[i][j]=a[j][i];
			}
		}
	}
	static void determinent(int a[][])
	{
		int det,x,y,z;
	        x=(a[0][0] * (a[1][1] * a[2][2]- a[1][2] * a[2][1]));
       		 y=(a[0][1] * (a[1][0] * a[2][2] - a[1][2] * a[2][0]));
        	z=(a[0][2] * (a[1][0] * a[2][1] - a[1][1] * a[2][0]));
		det=x-y+z;
		System.out.println("Determinent of matrix A:"+det);
	}
}
