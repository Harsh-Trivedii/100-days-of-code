public class StringMethods
{
	public static void main(String args[])
	{
		String s1="computer programming";
		System.out.println("Given String:"+s1);
		int le=s1.length();
		System.out.println("Length of string:"+le);
		String first="Harsh ";
		String second="Trivedi";
		String com=first.concat(second);
		System.out.println("Combined string:"+com);
		String third="Harsh ";
		boolean res=first.equals(third);
		System.out.println("String first and third are equal:"+res);
		String upper=s1.toUpperCase();
		System.out.println("In Upper Case:"+upper);
		String sub=s1.substring(0,8);
		System.out.println("Substring:"+sub);
	}
}
