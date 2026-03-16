class Solution {
    public boolean canJump(int[] nums) {
        // int ind = nums[0]; 
        int n = nums.length; 
        int nextInd = 0; 



        for(int i = 0; i < n; i++){

            if(nums[i] >= n-1 || i>=n-1) return true; 
            
            nextInd = Math.max(nextInd,(nums[i]+i));
            
            if(nums[i]==0 && i >= nextInd) return false; 
        }

        return true; 


    }
}