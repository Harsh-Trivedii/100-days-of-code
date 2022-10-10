// Reversing a string
import java.util.Scanner;
public class StringReverse
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your word:");
	String s1=s.next();
	String temp="";
	for(int i=s1.length()-1;i>=0;i--)
	{
		char c=s1.charAt(i);
		temp+=c;

	}
	System.out.println(temp);
}
}
