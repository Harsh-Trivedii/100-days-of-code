/* To read bytes from a file all characters 
A FileInputStream obtains input bytes from a file in a file system */

import java.io.FileInputStream;
public class fileread2
{
	public static void main(String args[])
	{
		try{
		FileInputStream f=new FileInputStream("C:\\Users\\Harsh\\Desktop\\readfile.txt");
		int i=0;
		while((i=f.read())!=-1)
		{
			System.out.print((char)i);
		}	
		f.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
