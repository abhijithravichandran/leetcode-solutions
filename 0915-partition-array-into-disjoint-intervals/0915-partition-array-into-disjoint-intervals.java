class Solution {
    public int partitionDisjoint(int[] nums) {
        int n = nums.length;  
        int[] min = new int[n];
        int minSoFar = Integer.MAX_VALUE;  
        for(int i = n-1; i >= 0; i--){
            minSoFar = Math.min(nums[i],minSoFar);
            min[i] = minSoFar; 
        }

        int maxSoFar = nums[0]; 
        for(int i = 0; i < n-1; i++){
            
            if(maxSoFar <= min[i+1]) return i+1; 
            maxSoFar = Math.max(maxSoFar,nums[i]);
        }

        return 1;  
    }
}