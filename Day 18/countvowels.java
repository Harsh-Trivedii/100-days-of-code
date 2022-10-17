//Count vowels in a sentence
import java.util.*;
public class countvowels{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your string:");
		String s1=s.nextLine();
		s1=s1.toLowerCase();
		int tot=0;
		int a=0,e=0,i=0,o=0,u=0;
		for(int j=0;j<s1.length();j++)
		{
			if(s1.charAt(j)=='a')
			{
				a++;
				tot++;		
			}
			else if(s1.charAt(j)=='e')
			{
    				e++;
				tot++;
			}
			else if(s1.charAt(j)=='i')
			{
				i++;
				tot++;
			}
			else if(s1.charAt(j)=='o')
			{
				o++;
				tot++;
			}
			else if(s1.charAt(j)=='u')
			{
				u++;
				tot++;
			}
		}
		System.out.println("Total number of vowels:"+tot);
		System.out.println("Total number of:\n"+"a:"+a+"\ne:"+e+"\ni:"+i+"\no:"+o+"\nu:"+u);
}
}
