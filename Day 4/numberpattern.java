// palindrome number pattern
public class numberpattern
{
public static void main(String args[])
{
int i,j,k,l;
int n=5;
for(i=1;i<=n;i++)
{
for(k=n;k>=i;k--)
{
System.out.print(" ");
}
for(j=1;j<=i;j++)
{
System.out.print(j+" ");
}
for(l=j-2;l>0;l--)
{
System.out.print(l+" ");
}
System.out.println();
}

}
}
