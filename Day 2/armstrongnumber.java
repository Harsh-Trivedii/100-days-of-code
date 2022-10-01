//To find armstrong number upto 1000
public class armstrongnumber
{
	public static void main(String args[])
	{
		int i,n,m,rem;
		for(i=0;i<=1000;i++)
		{
			n=i;
			m=i;
			int sum=0;
			while(n!=0)
			{
				rem=n%10;
				sum=sum+(rem*rem*rem);
				n=n/10;
			}	
			if(sum==i)
			{
				System.out.println(" "+sum);
			}
		}
	}
}
