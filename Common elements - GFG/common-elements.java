//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            
            int A[] = new int[n1];
            int B[] = new int[n2];
            int C[] = new int[n3];
            
            for (int i = 0;i < n1;i++)
            {
                A[i] = sc.nextInt();
            }
            for (int i = 0;i < n2;i++)
            {
                B[i] = sc.nextInt();
            }
            for (int i = 0;i < n3;i++)
            {
                C[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            ArrayList<Integer> res = sol.commonElements(A, B, C, n1, n2, n3);
            if (res.size() == 0)
            {
                System.out.print(-1);
            }
            else 
            {
                for (int i = 0;i < res.size();i++)
                {
                    System.out.print(res.get(i) + " ");
                }    
            }
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here
        int i =0;
        int j =0;
        int k=0;
        //int[] test = int[3];
        
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> ans1 = new ArrayList<>();
        ArrayList<Integer> ans3 = new ArrayList<>();
        HashSet<Integer> ans2 = new HashSet<>();
        
        
        
        while(i<n1&&j<n2){
            
            if(A[i]>B[j]) j++;
            else if(A[i]<B[j]) i++;
            else{
                 ans.add(A[i]);
                 i++;
                 j++;
            }
        }
        int l=0;
        
         while(k<n3&&l<ans.size()){
            
            if(C[k]>ans.get(l)) l++;
            else if(C[k]<ans.get(l)) k++;
            else{
                 ans1.add(C[k]);
                 l++;
                 k++;
            }
        }
        
        for(int x:ans1){
            ans2.add(x);
        }
        
         for(int x:ans2){
            ans3.add(x);
        }
        Collections.sort(ans3);
        return ans3;
    }
}