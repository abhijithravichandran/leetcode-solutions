class Solution {
    public int maxSubArray(int[] nums) {
        int maxSub =nums[0]; 

        int maxEnding = nums[0]; 

        for(int i = 1; i < nums.length; i++){
            maxEnding = Math.max(maxEnding + nums[i], nums[i]);

            maxSub = Math.max(maxSub,maxEnding);
        }

        return maxSub; 
    }
}