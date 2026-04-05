class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length; 

        int cnt = 2, maxLen = 2; 
        for(int i = 2; i < n; i++){

            if(nums[i]==nums[i-1]+nums[i-2]){
                cnt++; 
                maxLen = Math.max(maxLen,cnt);
            }
            else{
                cnt = 2; 
            }
        }
        return maxLen; 
    }
}