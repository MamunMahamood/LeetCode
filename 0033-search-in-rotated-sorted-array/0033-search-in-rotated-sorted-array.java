class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low =0; 
        int high = n-1;
        while(low<=high){
            if(nums[low]==target){
                return low;
            }
            else if(nums[high]==target){
                return high;
            }
            else{
                low++;
                high--;
            }

        }return -1;
    }
}