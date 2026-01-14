class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = Double.NEGATIVE_INFINITY; 
        double window = 0; 
    
        for(int i = 0; i < k; i++){
            window += nums[i];
        }
        maxAvg = Math.max(maxAvg,(window)/k);

        for(int i = k; i < nums.length;i++){
            int cur = nums[i];
            window += cur; 
            window -= nums[i-k];
            maxAvg = Math.max(maxAvg,(window)/k);
        }
        return maxAvg; 
    }
}