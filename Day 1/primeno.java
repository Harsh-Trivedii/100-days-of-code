import java.util.*;
public class primeno
{
	public static void main(String args[])
	{
		int i,j,flag,n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n [last number till you want to display prime numbers]:");
		n=s.nextInt();	
		System.out.println("All prime numbers between 2 to "+n+" are:");
		for(i=2;i<=n;i++)
		{
			flag=0;
			for(j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.print(i+" ");
		}

	}
}
