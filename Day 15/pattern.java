// Entered name in pattern
import java.util.*;
public class pattern
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter your String:");
String s1=s.next();
String s2="";
for(int i=0;i<s1.length();i++)
{
for(int j=0;j<=i;j++)
{
	System.out.print(s1.charAt(j));	
}
	System.out.println();
}

}
}
