class Solution {
    public int climbStairs(int n) {
        int f = 0;
        int s = 1;
        int sum = 0;
        
        
        
        for(int i=0;i<n;i++){
            sum = f+s;
            f=s;
            s=sum;
            
            
        
        
        }
        return sum;
    }
}