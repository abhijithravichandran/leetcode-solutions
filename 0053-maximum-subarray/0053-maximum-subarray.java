class Solution {
    public int maxSubArray(int[] nums) {
        int maxSubarray = nums[0];
        int max = nums[0];

        for(int  i = 1; i < nums.length;  i++){

            maxSubarray = Math.max(maxSubarray + nums[i], nums[i]);

            max = Math.max(maxSubarray,max);
        }
        return max; 
    }
}