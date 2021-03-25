class Solution {
    public int minDifference(int[] nums) {
        if(nums.length<=3) return 0;
        
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        int l = nums.length;
        
        // in this question we consider 4 cases 
        // and return the min value among the 4 cases;
        
        // update first 3 elements;
        ans = Math.min(ans, nums[l-1]-nums[3]);
        
        // update last 3 elements;
        ans = Math.min(ans, nums[l-4]-nums[0]);
        
        // update first element and the last two elements;
        ans = Math.min(ans, nums[l-3]-nums[1]);
        
        // update first two elements and the last element;
        ans = Math.min(ans, nums[l-2]-nums[2]);
        
        return ans;
    }
}
