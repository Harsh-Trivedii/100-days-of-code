import javax.swing.JOptionPane;
public class fibonacciseries
{
public static void main(String args[])
{
int a=0,b=1,c;
int i=0,n;
n=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your number:"));
System.out.println("Fibonacci Series-");
System.out.print(" "+a);
System.out.print(" "+b);
for(i=3;i<=n;i++)
{
c=a+b;
System.out.print(" "+c);
a=b;
b=c;
}
}
}
