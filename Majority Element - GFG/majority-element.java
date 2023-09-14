//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        int n = size;
        
         HashMap<Integer, Integer> ans = new HashMap<>();
        
        
        for(int i =0; i<n; i++){
            if(ans.containsKey(a[i])){
                ans.put(a[i], ans.get(a[i])+1);
            }
            else ans.put(a[i],1);
        }
        
        
        for(int i=0; i<n; i++){
            if(ans.get(a[i])>n/2) return a[i];
        }
        
        return -1;
    }
}