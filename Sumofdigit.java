public class Sumofdigit
{
public static void main(String args[])
{
int n=43212;
int rem,sum=0;
while(n!=0)
{
rem=n%10;
sum=sum+rem;
n=n/10;
}
System.out.println("Sum of all digits="+sum);
}
}