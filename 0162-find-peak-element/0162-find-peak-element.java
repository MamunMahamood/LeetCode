class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int low=0;
        int high= n-1;
        while(low<high){
            if(nums[low]>nums[high]) high--;
            else low++;

        }return low;
    }
}