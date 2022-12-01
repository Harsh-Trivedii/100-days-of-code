//{ Driver Code Starts
import java.util.*;

class LargestSubarray
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
         HashMap<Integer, Integer> hM
            = new HashMap<Integer, Integer>();
 
        int sum = 0; 
        int max_len = 0; 
 
        for (int i = 0; i < arr.length; i++) {
 
            sum += arr[i];
 
            if (sum == 0)
                max_len = i + 1;
 
 
            Integer prev_i = hM.get(sum);
 
            if (prev_i != null)
                max_len = Math.max(max_len, i - prev_i);
            else 
                hM.put(sum, i);
        }
 
        return max_len;
    }
}
