class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length; 
        int nextMax = 0; 

        if(n==1) return true; 

        for(int i = 0; i < n; i++){
            
            if(i > nextMax) return false; 

            nextMax = Math.max(nextMax,(nums[i]+i));
        }

        return true; 
    }
}