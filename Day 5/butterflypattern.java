public class butterflypattern
{
public static void main(String args[])
{
int n=4;

//upper half
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
//first part
System.out.print("*");
}
//spaces
for(int m=1;m<=2*(n-i);m++)
{
System.out.print(" ");
}

//2nd part stars
for(int l=1;l<=i;l++)
{
System.out.print("*");
}
System.out.println();
}



//2nd half reverse of 1st half
for(int i=n;i>=1;i--)
{
for(int j=1;j<=i;j++)
{
//first part
System.out.print("*");
}
//spaces
for(int m=1;m<=2*(n-i);m++)
{
System.out.print(" ");
}

//2nd part stars
for(int l=1;l<=i;l++)
{
System.out.print("*");
}
System.out.println();
}


}
}
