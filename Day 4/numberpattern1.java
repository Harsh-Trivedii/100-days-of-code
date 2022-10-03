/* number pattern
     1
    2 3
   4 5 6
  7 8 9 10
 11 12 13 14 15
*/
public class numberpattern1
{
public static void main(String args[])
{
int i,j,k;
int n=5,l=1;
for(i=1;i<=5;i++)
{
for(k=n;k>=i;k--)
{
System.out.print(" ");
}
for(j=1;j<=i;j++)
{
System.out.print(l+" ");
l++;
}
System.out.println();
}


}
}

