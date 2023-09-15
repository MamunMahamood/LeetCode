//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            ArrayList<String> arr = new ArrayList<String>();
            String input[] = read.readLine().split(" ");
            
            for(int i = 0; i < n; i++){
                arr.add(input[i]);
            }
            String word1 = read.readLine();
            String word2 = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.shortestDistance(arr,word1,word2));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int shortestDistance(ArrayList<String> s, String word1, String word2) {
        // code 
        int n = word1.length();
        int m = word2.length();
        
        //HashMap<String, Integer> a = new HashMap<>();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();
        
        for(int i=0; i<s.size(); i++){
            if(word1.compareTo(s.get(i))==0) a.add(i);
        }
        for(int i=0; i<s.size(); i++){
            if(word2.compareTo(s.get(i))==0) b.add(i);
        }
        
        
        //int max1=Collections.max(a);
        //int max2=Collections.min(b);
        
        
        for(int i =0; i<a.size(); i++){
            for(int j = 0; j<b.size(); j++){
                c.add(Math.abs(a.get(i)-b.get(j)));
            }
        }
        
        return Collections.min(c);
    }
    
    
};