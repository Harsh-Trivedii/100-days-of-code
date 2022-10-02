/* 
printing star pattern 
*
**
***
****
*****
*/
import java.util.Scanner;
public class starpattern1
{
public static void main(String args[])
{
int i,j;
Scanner s=new Scanner(System.in);
System.out.println("Enter number of lines: ");
int n=s.nextInt();
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}
