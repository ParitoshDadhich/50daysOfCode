class Solution {
    public int majorityElement(int[] nums) {
        int l = nums.length;
        int count = 0;
        int element = nums[0];
        for(int i=0; i<l; i++){
            if(count == 0)
                element = nums[i];
            
            if(nums[i] == element)
                count++;
            else
                count--;
        }
        
        return element;
    }
}
