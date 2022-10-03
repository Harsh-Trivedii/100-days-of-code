// reverse triangular star pattern
public class starpattern4
{
public static void main(String args[])
{
int i,j,k;
int n=5;
for(i=1;i<=n;i++)
{
for(k=1;k<=i;k++)
{
System.out.print(" ");
}
for(j=n;j>=i;j--)
{
System.out.print(" *");
}
System.out.println();
}

}
}
