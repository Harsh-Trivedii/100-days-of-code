//{ Driver Code Starts
import java.util.*;

class Fascno {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Solution ob = new Solution();

        int T = sc.nextInt();

        while (T != 0) {
            long n = sc.nextLong();
            if (ob.fascinating(n))
                System.out.println("Fascinating");
            else
                System.out.println("Not Fascinating");
            T--;
        }
    }
}
// } Driver Code Ends


class Solution {
    boolean fascinating(long n) {
        // code here
        String s=n+""+n*2+""+n*3;

        char a[]=s.toCharArray();

        Arrays.sort(a);

        String s1=new String(a);

        if(s1.equals("123456789")){

            return true;

        }

        else{

            return false;

        }
    }
}
