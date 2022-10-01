// To find perfect number upto 500.
public class perfectnumber
{
	public static void main(String args[])
	{
		int sum=0,i,j;
		System.out.println("Perfect number upto 500");
		for(i=0;i<500;i++)
		{
			sum=0;
			for(j=1;j<i;j++)
			{
				if(i%j==0)
				{
					sum=sum+j;
				}
			}
			if(sum==i && sum!=0)
				System.out.println(i+" ");
		}
	}
}
