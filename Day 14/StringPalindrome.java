import java.util.*;
public class StringPalindrome
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter your string:");
String s1=s.next();
String s2="";
String s3="";
for(int i=s1.length()-1;i>=0;i--)
{
	int j=s1.length()-1;
	if(s1.charAt(j)!=s1.charAt(0))
	{
		System.out.println("Exit");
		break;
	}
	s2=s2+s1.charAt(i);	
}
if(s1.equals(s2))
{
	System.out.println("String is palindrome");
}
else
{
	System.out.println("String is not a palindrome");
}


}
}
