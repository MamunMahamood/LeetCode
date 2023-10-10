//{ Driver Code Starts
//Initial Template for Java



import java.util.stream.Collectors; 
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().print2largest(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int print2largest(int arr[], int n) {
        
        int i, first, second;
        // code here
        first = second = Integer.MIN_VALUE; 
        for (i = 0; i < n; i++) { 
            /* If current element is greater than  
            first then update both first and second */
            if (arr[i] > first) { 
                second = first; 
                first = arr[i]; 
            } 
  
            /* If arr[i] is in between first and  
               second then update second  */
            else if (arr[i] > second && arr[i] != first) 
                second = arr[i]; 
        }
        
         if (second == Integer.MIN_VALUE) 
            return -1;
        
        return second;
        
       
    
    }
}