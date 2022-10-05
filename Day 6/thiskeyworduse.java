//pythagoras theoram implementation using this keyword
import java.lang.Math;
import java.util.Scanner;
class calhypotenuse
{
	double perpendicular;
	double base;
	void getdata(double perpendicular,double base)
	{
		this.perpendicular=perpendicular;
		this.base=base;
	}
	void display()
	{
		double hypotenuse;
		System.out.println("Entered perpendicular:"+perpendicular);
		System.out.println("Entered base:"+base);
		hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(perpendicular, 2));
		System.out.println("The length of Hypotenuse is:"+hypotenuse);
	}
}
public class thiskeyworduse
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	double p,b;
	System.out.println("Enter perpendicular length:");
	p=s.nextDouble();
	System.out.println("Enter base length:");
	b=s.nextDouble();
	calhypotenuse h=new calhypotenuse();
	h.getdata(p,b);
	h.display();
}
}
