/* number pattern 3
      1
     2 2
    3 3 3
   4 4 4 4
  5 5 5 5 5 
*/
public class numberpattern3
{
public static void main(String args[])
{

int n=5;
int l=1;
for(int i=1;i<=5;i++)
{
for(int k=i;k<=n;k++)
{
System.out.print(" ");
}
for(int j=1;j<=i;j++)
{
System.out.print(l+" ");
}
l++;
System.out.println();
}

}
}
