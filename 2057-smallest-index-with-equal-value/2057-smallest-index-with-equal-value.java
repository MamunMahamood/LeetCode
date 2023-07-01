class Solution {
    public int smallestEqual(int[] nums) {
        int n = nums.length;
        //Arrays.sort(nums);
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i<n; i++){
            if(i%10==nums[i]) a.add(i);
        }
        if(a.size()==0) return -1;
        else return Collections. min(a);
        
         


    }
}