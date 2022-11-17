import javax.swing.JOptionPane;
class ConstructorOverload
{
public static void main(String args[])
{
int l,b,s;
String s1,s2,s3;
OverloadConstructor a=new OverloadConstructor();
s1=JOptionPane.showInputDialog(null,"Enter Length");
s2=JOptionPane.showInputDialog(null,"Enter Breadth");
s3=JOptionPane.showInputDialog(null,"Enter Side");
l=Integer.parseInt(s1);
b=Integer.parseInt(s2);
s=Integer.parseInt(s3);
OverloadConstructor a1=new OverloadConstructor(l,b,s);
a.display();
a.area();
a1.display();
a1.area();
}
}
class OverloadConstructor
{
int le,br,side;
OverloadConstructor()
{
le=10;
br=20;
side=20;
}
OverloadConstructor(int l,int b,int s)
{
le=l;
br=b;
side=s;
}
public void display()
{
System.out.println("Length="+le);
System.out.println("\nBreadth="+br);
System.out.println("\nSide="+side);
}
public void area()
{
int area,Area;
area=le*br;
Area=side*side;
System.out.println("\nAREA OF RECTANGLE="+area);
System.out.println("\nAREA OF SQUARE="+Area);
}
}
