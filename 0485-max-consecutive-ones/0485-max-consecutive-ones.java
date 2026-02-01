class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, maxLen = 0; 
        for(int i = 0; i < nums.length; i++){
            count++;
            if(nums[i]!=1) count = 0; 
            maxLen = Math.max(maxLen,count);
        }
        return maxLen; 
    }
}