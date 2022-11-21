
import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
 
        int t= sc.nextInt();
        
        while(t-- >0)
        {
 
            String st = sc.next();
 
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}

class Solution
{
    static boolean ispar(String x)
    {
                 Stack<String> stack = new Stack<>();

        for (int i = 0; i < x.length(); i++) {
            String parenthesis = String.valueOf(x.charAt(i));
            if ("(".equals(parenthesis) || 
                "{".equals(parenthesis) || 
                "[".equals(parenthesis) ) {

                stack.push(parenthesis);
                continue;
            }

            if (stack.empty()) {
                return false;
            }

            if (")".equals(parenthesis)) {
                if ("(".equals(stack.pop())) {
                    continue;
                } else {
                    return false;
                }
            }

            if ("}".equals(parenthesis)) {
                if ("{".equals(stack.pop())) {
                    continue;
                } else {
                    return false;
                }
            }

            if ("]".equals(parenthesis)) {
                if ("[".equals(stack.pop())) {
                    continue;
                } else {
                    return false;
                }
            }
        }

        if (stack.empty()) {
            return true;
        } else {
            return false;
        }
    }
}
