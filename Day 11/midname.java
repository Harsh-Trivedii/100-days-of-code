// Extracting middle name from full name
import java.util.*;
public class midname {
  public static void main(String[] args) 
  {
    Scanner s= new Scanner(System.in);
    System.out.println("Enter your full name: ");
    String s1 =s.nextLine();
    String middlename="";
    int firstspace = s1.indexOf(" ");
    int lastspace = s1.lastIndexOf(" ");
    middlename = s1.substring(firstspace,lastspace);  
    System.out.println(middlename);
	}
}
