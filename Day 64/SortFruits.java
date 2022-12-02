public class SortFruits
{
public static void main(String args[])
{
if(args.length==0)
{
System.out.println("Please provide command line arguments!");
System.exit(0);
}
else{
   int i;
System.out.println("Before Sorting");
for(i=0;i<args.length;i++)
{
System.out.println("\n"+args[i]);
}

for(i=0;i<args.length;i++)
{
for(int j=0;j<args.length;j++)
{
if(args[i]>args[j])
{
String temp=args[i];
args[i]=args[j];
args[j]=temp;
}
}
}

System.out.println("After Sorting");
for(i=0;i<args.length;i++)
{
System.out.println("\n"+args[i]);
}
}
}
} 
