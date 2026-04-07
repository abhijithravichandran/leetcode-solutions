class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length; 

        int maxSub = Integer.MIN_VALUE, minSub = Integer.MAX_VALUE, totalSum = 0, curMin = 0, curMax = 0;
        for(int i = 0; i < n ; i++){
            totalSum += nums[i];

            curMax = Math.max(nums[i], nums[i]+curMax);
            maxSub = Math.max(curMax,maxSub);

            curMin = Math.min(nums[i],nums[i]+curMin);
            minSub = Math.min(minSub,curMin);
            
        }

        if(totalSum==minSub) return maxSub;

        return Math.max(maxSub, totalSum - minSub);
    }
}