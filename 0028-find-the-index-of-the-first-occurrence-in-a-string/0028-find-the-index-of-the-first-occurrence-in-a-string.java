class Solution {
    public int strStr(String haystack, String needle) {
        int n = needle.length();
        int m = haystack.length();

        int low =0;
        int high = n-1;
        int f=0;
       

        while(high<=m-1){
            
            int i = 0;
            int j = n-1;
            int k =low;
            
           
            while(i<=j&&k<=high){
                

                if(needle.charAt(i)!=haystack.charAt(k)){
                    f=1;
                    break;
                }

               i++;
               k++;

            }
            if(f==0) return low;
            low++;
            high++;
            i=0;
            f=0;
            
        }return -1;
    }
}