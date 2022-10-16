// Count total number of occurrences  of word the in a sentence
import java.util.*;
public class CountOccurence
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your string:");
		String s1=s.nextLine();
		String word="the";
		String s2[]=s1.split(" ");
		int count=0;
		for(int i=0;i<s2.length;i++)
		{
			if(word.equals(s2[i]))
				count++;
		}
		System.out.println("Total number of occurence of word "+word+" is:"+count);
	}
}
