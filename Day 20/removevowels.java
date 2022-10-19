import java.util.*;
public class removevowels{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your string:");
		String s1=s.nextLine();
		s1=s1.toLowerCase();
		s1=s1.replace("a","");
		s1=s1.replace("e","");
		s1=s1.replace("i","");
		s1=s1.replace("o","");
		s1=s1.replace("u","");
		System.out.println("Final string after removing vowels:"+s1);

}
}
