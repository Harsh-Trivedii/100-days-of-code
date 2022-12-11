import java.io.FileOutputStream;
public class OutputStream2
{
	public static void main(String args[])
	{
		try{
		FileOutputStream f=new FileOutputStream("C:\\Users\\Harsh\\Desktop\\outputfile2.txt");
		String s="Welcome to java";
		byte b[]=s.getBytes();
		f.write(b);
		f.close();
		System.out.println("Success");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
