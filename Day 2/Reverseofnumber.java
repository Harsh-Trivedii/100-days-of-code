// To find reverse of a given number
public class Reverseofnumber
{
public static void main(String args[])
{
	int n=43212;
	int rem,rev=0;
	while(n!=0)
	{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;	
	}
	System.out.println("Reverse of the number is: "+rev);
}
}
