class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length, missing = n*(n+1)/2;

        for(int i = 0; i < n; i++){
            missing -= nums[i];
        }

        return missing; 
    }
}